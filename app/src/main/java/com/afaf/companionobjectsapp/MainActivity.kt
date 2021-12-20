package com.afaf.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var constraintLayout: ConstraintLayout
    lateinit var dayNightEditText: EditText
    lateinit var changeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constraintLayout = findViewById(R.id.clbackground)
        dayNightEditText = findViewById(R.id.etDayNight)
        changeButton = findViewById(R.id.btChange)
        changeButton.setOnClickListener {
            val Backgrounds = Background(this)
            Backgrounds.set(constraintLayout, dayNightEditText.text.toString())
        }
    }
}