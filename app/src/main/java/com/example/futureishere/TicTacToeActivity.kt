package com.example.futureishere

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_tic_tac_toe.*

class TicTacToeActivity : AppCompatActivity() {
    private var Player = true
    var Xscore:Int = 0
    var Oscore:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_tic_tac_toe)
        init()

    }
    private fun init(){
        RestartButton.setOnClickListener  {
            reset()
        }
        button00.setOnClickListener {
            CheckPlayer(button00)
        }

        button01.setOnClickListener {
            CheckPlayer(button01)
        }

        button02.setOnClickListener {
            CheckPlayer(button02)
        }

        button10.setOnClickListener {
            CheckPlayer(button10)
        }

        button11.setOnClickListener {
            CheckPlayer(button11)
        }

        button12.setOnClickListener {
            CheckPlayer(button12)
        }

        button20.setOnClickListener {
            CheckPlayer(button20)
        }

        button21.setOnClickListener {
            CheckPlayer(button21)
        }

        button22.setOnClickListener {
            CheckPlayer(button22)
        }
    }


    private fun CheckPlayer(button: Button){
        if (Player) {
            if (button.text.isEmpty()) {
                button.setTextColor(Color.parseColor("#D500ADFF"))
                button.text = "X"
                Player = false
            }
        } else {
            button.setTextColor(Color.parseColor("#D35B5B"))
            button.text = "O"
            Player = true
        }
        if (button00.text.isNotEmpty() && button00.text == button01.text && button00.text == button02.text){
            Toast.makeText(this,"Winner is ${button00.text}",Toast.LENGTH_SHORT).show()
            if (button00.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button00.text.isNotEmpty() && button00.text == button11.text && button00.text == button22.text) {
            Toast.makeText(this, "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()
            if (button00.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button00.text.isNotEmpty() && button00.text == button10.text && button00.text == button20.text) {
            Toast.makeText(this, "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()
            if (button00.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button01.text.isNotEmpty() && button01.text == button11.text && button01.text == button21.text) {
            Toast.makeText(this, "Winner is ${button01.text}", Toast.LENGTH_SHORT).show()
            if (button01.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button02.text.isNotEmpty() && button02.text == button11.text && button02.text == button20.text) {
            Toast.makeText(this, "Winner is ${button02.text}", Toast.LENGTH_SHORT).show()
            if (button02.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button02.text.isNotEmpty() && button02.text == button01.text && button02.text == button00.text) {
            Toast.makeText(this, "Winner is ${button02.text}", Toast.LENGTH_SHORT).show()
            if (button02.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button02.text.isNotEmpty() && button02.text == button12.text && button02.text == button22.text) {
            Toast.makeText(this, "Winner is ${button02.text}", Toast.LENGTH_SHORT).show()
            if (button02.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button10.text.isNotEmpty() && button10.text == button11.text && button10.text == button12.text) {
            Toast.makeText(this, "Winner is ${button10.text}", Toast.LENGTH_SHORT).show()
            if (button10.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button12.text.isNotEmpty() && button12.text == button11.text && button12.text == button10.text) {
            Toast.makeText(this, "Winner is ${button12.text}", Toast.LENGTH_SHORT).show()
            if (button12.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button20.text.isNotEmpty() && button20.text == button10.text && button20.text == button00.text) {
            Toast.makeText(this, "Winner is ${button20.text}", Toast.LENGTH_SHORT).show()
            if (button20.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button20.text.isNotEmpty() && button20.text == button11.text && button20.text == button02.text) {
            Toast.makeText(this, "Winner is ${button20.text}", Toast.LENGTH_SHORT).show()
            if (button20.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button20.text.isNotEmpty() && button20.text == button21.text && button20.text == button22.text) {
            Toast.makeText(this, "Winner is ${button20.text}", Toast.LENGTH_SHORT).show()
            if (button20.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button21.text.isNotEmpty() && button21.text == button11.text && button21.text == button01.text) {
            Toast.makeText(this, "Winner is ${button21.text}", Toast.LENGTH_SHORT).show()
            if (button21.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button22.text.isNotEmpty() && button22.text == button21.text && button22.text == button20.text) {
            Toast.makeText(this, "Winner is ${button22.text}", Toast.LENGTH_SHORT).show()
            if (button22.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button22.text.isNotEmpty() && button22.text == button11.text && button22.text == button00.text) {
            Toast.makeText(this, "Winner is ${button22.text}", Toast.LENGTH_SHORT).show()
            if (button22.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }else if (button22.text.isNotEmpty() && button22.text == button12.text && button22.text == button02.text) {
            Toast.makeText(this, "Winner is ${button22.text}", Toast.LENGTH_SHORT).show()
            if (button22.text == "X"){
                Xscore ++
                XscoreView.text = "" + Xscore
            }else{
                Oscore ++
                OscoreView.text = "" + Oscore
            }
            DisableClicks()
        }
    }
    private fun reset(){
        button00.isClickable = true
        button01.isClickable = true
        button02.isClickable = true
        button10.isClickable = true
        button11.isClickable = true
        button12.isClickable = true
        button20.isClickable = true
        button21.isClickable = true
        button22.isClickable = true

        button00.text = ""
        button01.text = ""
        button02.text = ""
        button10.text = ""
        button11.text = ""
        button12.text = ""
        button20.text = ""
        button21.text = ""
        button22.text = ""
    }
    private fun DisableClicks(){
        button00.isClickable = false
        button01.isClickable = false
        button02.isClickable = false
        button10.isClickable = false
        button11.isClickable = false
        button12.isClickable = false
        button20.isClickable = false
        button21.isClickable = false
        button22.isClickable = false
    }
}
