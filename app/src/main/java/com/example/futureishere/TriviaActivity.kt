package com.example.futureishere

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_trivia.*

class TriviaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }
}
