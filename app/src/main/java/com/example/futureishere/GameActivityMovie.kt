package com.example.futureishere

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_game_movie.*
import kotlinx.android.synthetic.main.activity_game_sport.*
import kotlinx.android.synthetic.main.activity_game_sport.ScoreInGame
import kotlinx.android.synthetic.main.activity_game_sport.ScoreInGameLast
import kotlinx.android.synthetic.main.activity_game_sport.ScoreText

class GameActivityMovie : AppCompatActivity() {
    private var mediaPlayer:MediaPlayer? = null
    private var mediaPlayer2:MediaPlayer? = null
    var res:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_game_movie)
        mediaPlayer = MediaPlayer.create(this,R.raw.correct)
        mediaPlayer2 = MediaPlayer.create(this,R.raw.wrong)








        movie_answer_11.setOnClickListener {
            if(movie_answer_11.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_1.isVisible = false
                answer_movie_button_1.isVisible = false
                question_movie_2.isVisible = true
                answer_movie_button_2.isVisible = true
            }
        }
        movie_answer_12.setOnClickListener {
            if(movie_answer_12.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_1.isVisible = false
                answer_movie_button_1.isVisible = false
                question_movie_2.isVisible = true
                answer_movie_button_2.isVisible = true
            }
        }
        movie_answer_13.setOnClickListener {
            if(movie_answer_13.isPressed){
                mediaPlayer?.start()
                res ++
                ScoreInGame.text = "" + res
                question_movie_1.isVisible = false
                answer_movie_button_1.isVisible = false
                question_movie_2.isVisible = true
                answer_movie_button_2.isVisible = true
            }
        }
        movie_answer_14.setOnClickListener {
            if(movie_answer_14.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_1.isVisible = false
                answer_movie_button_1.isVisible = false
                question_movie_2.isVisible = true
                answer_movie_button_2.isVisible = true
            }
        }







        movie_answer_21.setOnClickListener {
            if(movie_answer_21.isPressed){
                mediaPlayer?.start()
                res ++
                ScoreInGame.text = "" + res
                question_movie_2.isVisible = false
                answer_movie_button_2.isVisible = false
                question_movie_3.isVisible = true
                answer_movie_button_3.isVisible = true
            }
        }
        movie_answer_22.setOnClickListener {
            if(movie_answer_22.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_2.isVisible = false
                answer_movie_button_2.isVisible = false
                question_movie_3.isVisible = true
                answer_movie_button_3.isVisible = true
            }
        }
        movie_answer_23.setOnClickListener {
            if(movie_answer_23.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_2.isVisible = false
                answer_movie_button_2.isVisible = false
                question_movie_3.isVisible = true
                answer_movie_button_3.isVisible = true
            }
        }
        movie_answer_24.setOnClickListener {
            if(movie_answer_24.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_2.isVisible = false
                answer_movie_button_2.isVisible = false
                question_movie_3.isVisible = true
                answer_movie_button_3.isVisible = true
            }
        }





        movie_answer_31.setOnClickListener {
            if(movie_answer_31.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_3.isVisible = false
                answer_movie_button_3.isVisible = false
                question_movie_4.isVisible = true
                answer_movie_button_4.isVisible = true
            }
        }
        movie_answer_32.setOnClickListener {
            if(movie_answer_32.isPressed){
                mediaPlayer?.start()
                res ++
                ScoreInGame.text = "" + res
                question_movie_3.isVisible = false
                answer_movie_button_3.isVisible = false
                question_movie_4.isVisible = true
                answer_movie_button_4.isVisible = true
            }
        }
        movie_answer_33.setOnClickListener {
            if(movie_answer_33.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_3.isVisible = false
                answer_movie_button_3.isVisible = false
                question_movie_4.isVisible = true
                answer_movie_button_4.isVisible = true
            }
        }
        movie_answer_34.setOnClickListener {
            if(movie_answer_34.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_3.isVisible = false
                answer_movie_button_3.isVisible = false
                question_movie_4.isVisible = true
                answer_movie_button_4.isVisible = true
            }
        }



        movie_answer_41.setOnClickListener {
            if(movie_answer_41.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_4.isVisible = false
                answer_movie_button_4.isVisible = false
                question_movie_5.isVisible = true
                answer_movie_button_5.isVisible = true
            }
        }
        movie_answer_42.setOnClickListener {
            if(movie_answer_42.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_4.isVisible = false
                answer_movie_button_4.isVisible = false
                question_movie_5.isVisible = true
                answer_movie_button_5.isVisible = true
            }
        }
        movie_answer_43.setOnClickListener {
            if(movie_answer_43.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_4.isVisible = false
                answer_movie_button_4.isVisible = false
                question_movie_5.isVisible = true
                answer_movie_button_5.isVisible = true
            }
        }
        movie_answer_44.setOnClickListener {
            if(movie_answer_44.isPressed){
                mediaPlayer?.start()
                res ++
                ScoreInGame.text = "" + res
                question_movie_4.isVisible = false
                answer_movie_button_4.isVisible = false
                question_movie_5.isVisible = true
                answer_movie_button_5.isVisible = true
            }
        }







        movie_answer_51.setOnClickListener {
            if(movie_answer_51.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_5.isVisible = false
                answer_movie_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromMovie.isVisible = true

            }
        }
        movie_answer_52.setOnClickListener {
            if(movie_answer_52.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_5.isVisible = false
                answer_movie_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromMovie.isVisible = true
            }
        }
        movie_answer_53.setOnClickListener {
            if(movie_answer_53.isPressed){
                mediaPlayer?.start()
                res ++
                ScoreInGame.text = "" + res
                question_movie_5.isVisible = false
                answer_movie_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromMovie.isVisible = true
            }
        }
        movie_answer_54.setOnClickListener {
            if(movie_answer_54.isPressed){
                mediaPlayer2?.start()
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_movie_5.isVisible = false
                answer_movie_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromMovie.isVisible = true
            }
        }
        BackToCategoryFromMovie.setOnClickListener {
            startActivity(Intent(this,TriviaActivity::class.java))
        }
    }
}
