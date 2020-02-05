package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_modern_namiokobana.*
import kotlinx.android.synthetic.main.activity_never_ever.*
import java.util.*
import kotlin.concurrent.timer

class ModernNamiokobana : AppCompatActivity() {
    val words = arrayOf<String>("Chicken","Wall","Weed","Minecraft")
    var blue_score_kotlin:Int = 0
    var red_score_kotlin:Int = 0
    var round_counter:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_modern_namiokobana)



        team_select_button.setOnClickListener {
            team_select_button.isVisible = false
            namiokobana_guide.isVisible = false
            team_select_banner.isVisible = true
            blue_start_button.isVisible = true
        }
        blue_start_button.setOnClickListener {
            team_select_banner.isVisible = false
            blue_start_button.isVisible = false
            BackToProfileFromNamiokobana.isVisible = false
            blue_game.isVisible = true
            timer1()
            init1()
        }
        blue_right_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            blue_word.setText(words[n])
            blue_score_kotlin ++
            blue_score.text = "" + blue_score_kotlin
            blue_score_in_board.text = "" + blue_score_kotlin
            blue_score_in_board_2.text = "" + blue_score_kotlin
        }
        blue_wrong_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            blue_word.setText(words[n])
            blue_score_kotlin --
            blue_score.text = "" + blue_score_kotlin
            blue_score_in_board.text = "" + blue_score_kotlin
            blue_score_in_board_2.text = "" + blue_score_kotlin
        }
        next_round.setOnClickListener {
            score_bar.isVisible = false
            red_game.isVisible = true
            timer2()
            init2()
        }
        red_right_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            red_word.setText(words[n])
            red_score_kotlin ++
            red_score.text = "" + red_score_kotlin
            red_score_in_board.text = "" + red_score_kotlin
            red_score_in_board_2.text = "" + red_score_kotlin
        }
        red_wrong_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            red_word.setText(words[n])
            red_score_kotlin --
            red_score.text = "" + red_score_kotlin
            red_score_in_board.text = "" + red_score_kotlin
            red_score_in_board_2.text = "" + red_score_kotlin
        }
        next_round_2.setOnClickListener {
            round_counter ++
            score_bar_2.isVisible = false
            blue_game.isVisible = true
            timer1()
            init3()
        }
        red_restart.setOnClickListener {
            red_final_page.isVisible = false
            team_select_banner.isVisible = true
            blue_start_button.isVisible = true
            BackToProfileFromNamiokobana.isVisible = true
            red_game.isVisible = false
            makeZero()
        }
        blue_restart.setOnClickListener {
            blue_final_page.isVisible = false
            team_select_banner.isVisible = true
            blue_start_button.isVisible = true
            BackToProfileFromNamiokobana.isVisible = true
            red_game.isVisible = false
            makeZero()
        }
        draw_restart.setOnClickListener {
            draw_final_page.isVisible = false
            team_select_banner.isVisible = true
            blue_start_button.isVisible = true
            BackToProfileFromNamiokobana.isVisible = true
            red_game.isVisible = false
            makeZero()
        }
        BackToProfileFromRedWon.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
        BackToProfileFromBlueWon.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
        BackToProfileFromDraw.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }

    }
    fun init1(){
        if (blue_start_button.isPressed){
            val r = Random()
            val n = r.nextInt(4)
            blue_word.setText(words[n])
        }
    }
    fun init2(){
        if (next_round.isPressed){
            val r = Random()
            val n = r.nextInt(4)
            red_word.setText(words[n])
        }
    }
    fun init3(){
        if(next_round_2.isPressed){
            val r = Random()
            val n = r.nextInt(4)
            blue_word.setText(words[n])
        }
    }
    fun makeZero(){
        blue_score_kotlin = 0
        red_score_kotlin = 0
        round_counter = 1
        red_score.text = "0"
        red_score_in_board.text = "0"
        red_score_in_board_2.text = "0"
        blue_score.text = "0"
        blue_score_in_board.text = "0"
        blue_score_in_board_2.text = "0"
    }
    private fun timer1() {
        object : CountDownTimer(2000, 1000) {

            override fun onFinish() {

                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) { // TODO Auto-generated catch block
                    e.printStackTrace()
                }
                score_bar.isVisible = true
                blue_game.isVisible = false
            }

            override fun onTick(millisUntilFinished: Long) {

                blue_timer.text = (millisUntilFinished / 1000).toString()

            }

        }.start()
    }
    private fun timer2() {
        object : CountDownTimer(2000, 1000) {

            override fun onFinish() {

                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) { // TODO Auto-generated catch block
                    e.printStackTrace()
                }
                if (round_counter == 5){
                    if(red_score_kotlin > blue_score_kotlin){
                        score_bar_2.isVisible = false
                        red_final_page.isVisible = true
                    }else if (blue_score_kotlin > red_score_kotlin){
                        score_bar_2.isVisible = false
                        blue_final_page.isVisible = true
                    }else{
                        score_bar_2.isVisible = false
                        draw_final_page.isVisible = true
                    }
                }else{
                    score_bar_2.isVisible = true
                    red_game.isVisible = false
                }
            }

            override fun onTick(millisUntilFinished: Long) {

                red_timer.text = (millisUntilFinished / 1000).toString()

            }

        }.start()
    }
}
