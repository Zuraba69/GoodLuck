package com.example.futureishere

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_tic_tac_toe.*

class TicTacToeActivity : AppCompatActivity() {
    private var Player = true


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
    }

}
