package com.example.futureishere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_never_ever.*
import java.util.*

class NeverEver : AppCompatActivity() {
    val words = arrayOf<String>("Never have I ever driven drunk.","Never have I ever spied on my neighbours.","Never have I ever made fun of someone.","Never have I ever Stole something.","Never have I ever bet on something.","Never have I ever cheated on a test.","Never have I ever Lied in this game.","Never have I ever Traveled by plane.","Never have I ever Stuck gum under a desk.","Never have I ever lied to my parents about being hung over.","Never have I ever Woken up drunk the next day.","Never have I ever Got drunk.","Never have I ever Smoked marijuana.","Never have I ever eaten food that fell on the floor.","Never have I ever Fought in the street.","Never have I ever Been robbed.","Never have I ever sang a serenade.","Never have I ever Been stuck in a lift.","Never have I ever Fallen asleep in the cinema.","Never have I ever Done something I regret.","Never have I ever taken part in a show.","Never have I ever gone surfing.","Never have I ever gone hunting.","Never have I ever gone vegan.","Never have I ever ridden an animal.","Never have I ever broken a bone.","Never have I ever shot a gun.","Never have I ever jumped from a roof.","Never have I ever been caught cheating on a test.","Never have I ever had a paranormal experience.","Never have I ever danced in an elevator.","Never have I ever stolen something from a restaurant.","Never have I ever woken up and couldn’t move.","Never have I ever tried to cut my own hair.","Never have I ever fallen in love at first sight.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_never_ever)


        BackToProfileFromNeverEver.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
        start_button.setOnClickListener {
            init()
            never_ever_guide.isVisible = false
            start_button.isVisible = false
            never_ever_sentence_bar.isVisible = true
            next_button.isVisible = true
        }
        next_button.setOnClickListener {
            val x = Random()
            val z = x.nextInt(35)
            never_ever_sentence.setText(words[z])
        }
    }
    fun init(){
        if (start_button.isPressed){
            val r = Random()
            val n = r.nextInt(35)
            never_ever_sentence.setText(words[n])
        }
    }
}
