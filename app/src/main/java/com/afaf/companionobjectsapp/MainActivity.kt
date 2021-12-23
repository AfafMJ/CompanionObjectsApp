package com.afaf.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    lateinit var constraintLayout: ConstraintLayout
    lateinit var dayNightEditText: EditText
    lateinit var changeButton: Button
    var isChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constraintLayout = findViewById(R.id.clbackground)
        dayNightEditText = findViewById(R.id.etDayNight)
        var check = findViewById<LottieAnimationView>(R.id.switchDay)
        check.setOnClickListener {
            if (isChecked){
                check.setMinAndMaxProgress(0.5f,1.0f)
                check.playAnimation()

                val Backgrounds = Background(this)
                Backgrounds.set(constraintLayout, dayNightEditText.text.toString())
                isChecked = false

            } else {
                check.setMinAndMaxProgress(0.0f,0.1f)
                check.playAnimation()
                val Backgrounds = Background(this)
                Backgrounds.set(constraintLayout, dayNightEditText.text.toString())

                isChecked = true


            }
        }

//        changeButton.setOnClickListener {
//            val Backgrounds = Background(this)
//            Backgrounds.set(constraintLayout, dayNightEditText.text.toString())
//        }
    }
}