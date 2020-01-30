package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        auth = FirebaseAuth.getInstance()
        setContentView(R.layout.activity_register)
        BackToLogInButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        CreateAcountButton.setOnClickListener {
            if (RegisterEmail.text.toString().isEmpty()){
                RegisterEmail.error = "Please enter email"
            }
            if (RegisterPassword.text.toString().isEmpty()){
                RegisterPassword.error = "Please enter password"
            } else{
                val email = RegisterEmail.text.toString()
                val password = RegisterPassword.text.toString()
                auth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this){task ->
                        if(task.isSuccessful){
                            startActivity(Intent(this,GameActivityMusic::class.java))
                        } else {Toast.makeText(this,"registration failed",Toast.LENGTH_LONG).show()}
                    }
            }
        }
    }
}
