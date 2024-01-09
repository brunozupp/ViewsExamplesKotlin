package com.novelitech.viewsexampleskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup

class CheckboxRadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio_button)

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

            println(orderString.trim())
        }
    }
}