package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.EmailAuthCredential
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_change_password.*

class ChangePassword : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
        setContentView(R.layout.activity_change_password)

        back_to_profile_btn.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }

        change_password_button_activity.setOnClickListener {
            passwordChange()
        }
    }

    private fun passwordChange(){
        val currentP = current_password.text.toString()
        val newP = New_password.text.toString()
        val confirmP = confirm_password.text.toString()
        if (currentP.isNotEmpty()&&
                newP.isNotEmpty()&&
                confirmP.isNotEmpty()){
            if (newP.equals(confirmP)){
                val user = auth.currentUser
                if(user!=null && user.email != null){
                    val credential = EmailAuthProvider
                        .getCredential(user.email!!,currentP)
                    user?.reauthenticate(credential)
                        ?.addOnCompleteListener(this){task ->
                            if(task.isSuccessful){
                                user?.updatePassword(newP)
                                    .addOnCompleteListener(this){task ->
                                        if(task.isSuccessful){
                                            Toast.makeText(this,"Password changed successfully",Toast.LENGTH_LONG).show()}
                                    }
                            }
                        }
                        }
                else {Toast.makeText(this,"Password mismatching",Toast.LENGTH_LONG).show()}
                }
            } else {Toast.makeText(this,"Please fill all the fields",Toast.LENGTH_LONG).show()}
        }
}
