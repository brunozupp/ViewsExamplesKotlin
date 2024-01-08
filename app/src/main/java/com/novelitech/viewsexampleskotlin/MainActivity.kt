package com.novelitech.viewsexampleskotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.novelitech.viewsexampleskotlin.ui.theme.ViewsExamplesKotlinTheme

class MainActivity : ComponentActivity() {

    lateinit var button: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_one)

        button = findViewById(R.id.btnAdd)
        result = findViewById(R.id.txtResult)

        button.setOnClickListener {

            val numberOne = findViewById<EditText>(R.id.editNumberOne).text
            val numberTwo = findViewById<EditText>(R.id.editNumberTwo).text

            if(numberOne.isEmpty() || numberOne.isBlank() || numberTwo.isEmpty() || numberTwo.isBlank()) {
                return@setOnClickListener
            }

            result.text = (numberOne.toString().toInt() + numberTwo.toString().toInt()).toString()
        }
    }
}

