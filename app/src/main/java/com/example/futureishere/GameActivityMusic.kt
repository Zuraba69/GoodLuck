package com.example.futureishere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game.*

class GameActivityMusic : AppCompatActivity() {

    var res: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_game)
        music_answear_12.setOnClickListener {
            if(music_answear_12.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_music_1.isVisible = false
                amswear_music_button_1.isVisible = false
                question_music_2.isVisible = true
                amswear_music_button_2.isVisible = true
            }
        }
        music_answear_11.setOnClickListener {
            if(music_answear_11.isPressed){
                question_music_1.isVisible = false
                amswear_music_button_1.isVisible = false
                question_music_2.isVisible = true
                amswear_music_button_2.isVisible = true
            }
        }
        music_answear_13.setOnClickListener {
            if(music_answear_13.isPressed){
                question_music_1.isVisible = false
                amswear_music_button_1.isVisible = false
                question_music_2.isVisible = true
                amswear_music_button_2.isVisible = true
            }
        }
        music_answear_14.setOnClickListener {
            if(music_answear_14.isPressed){
                question_music_1.isVisible = false
                amswear_music_button_1.isVisible = false
                question_music_2.isVisible = true
                amswear_music_button_2.isVisible = true
            }
        }
    }
}
