package com.novelitech.viewsexampleskotlin

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio_button)

        callCheckboxRadioButton()
    }

    private fun callCheckboxRadioButton() {
        val buttonOrder: Button = findViewById(R.id.btnOrder)

        buttonOrder.setOnClickListener {

            val radioGroup = findViewById<RadioGroup>(R.id.rgMeat)
            val checkedMeatRadioButtonId = radioGroup.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked

            val orderString = "You ordered a burger with:\n" +
                    "${meat.text}\n" +
                    "${if (cheese) "Cheese\n" else ""}" +
                    "${if (onions) "Onions\n" else ""}" +
                    "${if (salad) "Salad\n" else ""}"

            val result = findViewById<TextView>(R.id.txtResultOrder)

            result.text = orderString.trim()
        }
    }

    private fun callChallengeOne() {
        val button: Button = findViewById(R.id.btnAdd)
        val result: TextView = findViewById(R.id.txtResult)

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



