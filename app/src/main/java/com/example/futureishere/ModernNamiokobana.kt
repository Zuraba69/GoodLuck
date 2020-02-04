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

class ModernNamiokobana : AppCompatActivity() {
    val words = arrayOf<String>("Chicken","Wall","Weed","Minecraft")
    var blue_score_kotlin:Int = 0
    var red_score_kotlin:Int = 0

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
        }
        blue_wrong_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            blue_word.setText(words[n])
            blue_score_kotlin --
            blue_score.text = "" + blue_score_kotlin
            blue_score_in_board.text = "" + blue_score_kotlin
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
        }
        red_wrong_answer.setOnClickListener{
            val r = Random()
            val n = r.nextInt(4)
            red_word.setText(words[n])
            red_score_kotlin --
            red_score.text = "" + red_score_kotlin
            red_score_in_board.text = "" + red_score_kotlin
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
    private fun timer1() {
        object : CountDownTimer(30000, 1000) {

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
        object : CountDownTimer(30000, 1000) {

            override fun onFinish() {

                try {
                    Thread.sleep(100)
                } catch (e: InterruptedException) { // TODO Auto-generated catch block
                    e.printStackTrace()
                }
            }

            override fun onTick(millisUntilFinished: Long) {

                red_timer.text = (millisUntilFinished / 1000).toString()

            }

        }.start()
    }
}
