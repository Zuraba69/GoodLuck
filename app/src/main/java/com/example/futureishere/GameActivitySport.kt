package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game.ScoreInGame
import kotlinx.android.synthetic.main.activity_game.ScoreInGameLast
import kotlinx.android.synthetic.main.activity_game.ScoreText
import kotlinx.android.synthetic.main.activity_game_sport.*

class GameActivitySport : AppCompatActivity() {

    var res:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_game_sport)






        sport_answer_11.setOnClickListener {
            if(sport_answer_11.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_1.isVisible = false
                answer_sport_button_1.isVisible = false
                question_sport_2.isVisible = true
                answer_sport_button_2.isVisible = true
            }
        }
        sport_answer_12.setOnClickListener {
            if(sport_answer_12.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_1.isVisible = false
                answer_sport_button_1.isVisible = false
                question_sport_2.isVisible = true
                answer_sport_button_2.isVisible = true
            }
        }
        sport_answer_13.setOnClickListener {
            if(sport_answer_13.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_sport_1.isVisible = false
                answer_sport_button_1.isVisible = false
                question_sport_2.isVisible = true
                answer_sport_button_2.isVisible = true
            }
        }
        sport_answer_14.setOnClickListener {
            if(sport_answer_14.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_1.isVisible = false
                answer_sport_button_1.isVisible = false
                question_sport_2.isVisible = true
                answer_sport_button_2.isVisible = true
            }
        }







        sport_answer_21.setOnClickListener {
            if(sport_answer_21.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_2.isVisible = false
                answer_sport_button_2.isVisible = false
                question_sport_3.isVisible = true
                answer_sport_button_3.isVisible = true
            }
        }
        sport_answer_22.setOnClickListener {
            if(sport_answer_22.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_sport_2.isVisible = false
                answer_sport_button_2.isVisible = false
                question_sport_3.isVisible = true
                answer_sport_button_3.isVisible = true
            }
        }
        sport_answer_23.setOnClickListener {
            if(sport_answer_23.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_2.isVisible = false
                answer_sport_button_2.isVisible = false
                question_sport_3.isVisible = true
                answer_sport_button_3.isVisible = true
            }
        }
        sport_answer_24.setOnClickListener {
            if(sport_answer_24.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_2.isVisible = false
                answer_sport_button_2.isVisible = false
                question_sport_3.isVisible = true
                answer_sport_button_3.isVisible = true
            }
        }





        sport_answer_31.setOnClickListener {
            if(sport_answer_31.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_3.isVisible = false
                answer_sport_button_3.isVisible = false
                question_sport_4.isVisible = true
                answer_sport_button_4.isVisible = true
            }
        }
        sport_answer_32.setOnClickListener {
            if(sport_answer_32.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_3.isVisible = false
                answer_sport_button_3.isVisible = false
                question_sport_4.isVisible = true
                answer_sport_button_4.isVisible = true
            }
        }
        sport_answer_33.setOnClickListener {
            if(sport_answer_33.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_3.isVisible = false
                answer_sport_button_3.isVisible = false
                question_sport_4.isVisible = true
                answer_sport_button_4.isVisible = true
            }
        }
        sport_answer_34.setOnClickListener {
            if(sport_answer_34.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_sport_3.isVisible = false
                answer_sport_button_3.isVisible = false
                question_sport_4.isVisible = true
                answer_sport_button_4.isVisible = true
            }
        }



        sport_answer_41.setOnClickListener {
            if(sport_answer_41.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_4.isVisible = false
                answer_sport_button_4.isVisible = false
                question_sport_5.isVisible = true
                answer_sport_button_5.isVisible = true
            }
        }
        sport_answer_42.setOnClickListener {
            if(sport_answer_42.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_sport_4.isVisible = false
                answer_sport_button_4.isVisible = false
                question_sport_5.isVisible = true
                answer_sport_button_5.isVisible = true
            }
        }
        sport_answer_43.setOnClickListener {
            if(sport_answer_43.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_4.isVisible = false
                answer_sport_button_4.isVisible = false
                question_sport_5.isVisible = true
                answer_sport_button_5.isVisible = true
            }
        }
        sport_answer_44.setOnClickListener {
            if(sport_answer_44.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_4.isVisible = false
                answer_sport_button_4.isVisible = false
                question_sport_5.isVisible = true
                answer_sport_button_5.isVisible = true
            }
        }







        sport_answer_51.setOnClickListener {
            if(sport_answer_51.isPressed){
                res ++
                ScoreInGame.text = "" + res
                question_sport_5.isVisible = false
                answer_sport_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromSport.isVisible = true

            }
        }
        sport_answer_52.setOnClickListener {
            if(sport_answer_52.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_5.isVisible = false
                answer_sport_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromSport.isVisible = true
            }
        }
        sport_answer_53.setOnClickListener {
            if(sport_answer_53.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_5.isVisible = false
                answer_sport_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromSport.isVisible = true
            }
        }
        sport_answer_54.setOnClickListener {
            if(sport_answer_54.isPressed){
                Toast.makeText(this,"Wrong answer", Toast.LENGTH_SHORT).show()
                question_sport_5.isVisible = false
                answer_sport_button_5.isVisible = false
                ScoreInGameLast.text = ScoreInGame.text
                ScoreText.isVisible = true
                ScoreInGameLast.isVisible = true
                ScoreInGame.isVisible = false
                BackToCategoryFromSport.isVisible = true
            }
        }
        BackToCategoryFromSport.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
    }
}
