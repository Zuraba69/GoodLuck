package com.example.futureishere

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_trivia.*

class TriviaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_trivia)

        MusicButton.setOnClickListener {
            startActivity(Intent(this,GameActivityMusic::class.java))
        }
        SportButton.setOnClickListener {
            startActivity(Intent(this,GameActivitySport::class.java))
        }
        MovieButton.setOnClickListener {
            startActivity(Intent(this,GameActivityMovie::class.java))
        }
        BackToProfileFromTrivia.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
    }
}
