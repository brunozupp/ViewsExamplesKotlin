package com.novelitech.viewsexampleskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ChallengeOneActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_one)

        button = findViewById<Button>(R.id.btnAdd)
        result = findViewById<TextView>(R.id.txtResult)

        button.setOnClickListener {

            println("OLAAAAAAAAAAAAAAAAAAAAAAAAAAAA")

            val numberOne = findViewById<EditText>(R.id.editNumberOne)
            val numberTwo = findViewById<EditText>(R.id.editNumberTwo)

            result.text = (numberOne.text.toString().toInt() + numberTwo.text.toString().toInt()).toString()
        }


    }
}