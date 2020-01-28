package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        dontHaveAnAccountBtn.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

        LoginButton.setOnClickListener {
            if(LoginEmail.text.toString().isEmpty()){
                LoginEmail.error = "Please enter email"
            }
            if(LoginPassword.text.toString().isEmpty()){
                LoginPassword.error = "Please enter password"
            } else {
                val email = LoginEmail.text.toString()
                val password = LoginPassword.text.toString()
                auth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this){task ->
                        if(task.isSuccessful){
                            val intent = Intent(this,Profile::class.java)
                            startActivity(intent)
                        } else {Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show()}
                    }
            }
        }
    }
}
