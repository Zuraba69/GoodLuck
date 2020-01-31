package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_profile)

        MusicButton.setOnClickListener {
            startActivity(Intent(this,GameActivityMusic::class.java))
        }
        SportButton.setOnClickListener {
            startActivity(Intent(this,GameActivitySport::class.java))
        }
        MovieButton.setOnClickListener {
            startActivity(Intent(this,GameActivityMovie::class.java))
        }
        log_out_btn.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}
