package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText



import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



            override fun onCreate(savedInstanceState: Bundle?
                ) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val editWeight = findViewById<EditText>(R.id.edit_weight1)
                val editHeight = findViewById<EditText>(R.id.edit_height1)
                val buttonCalculate = findViewById<Button>(R.id.button_calculate1)
                val textBMI = findViewById<TextView>(R.id.text_bmi1)

                buttonCalculate.setOnClickListener {
                    val weight = editWeight.text.toString().toFloatOrNull() ?: 0f
                    val height = editHeight.text.toString().toFloatOrNull() ?: 0f

                    val bmi = weight / (height * height)

                    textBMI.text = "Your BMI is: %.2f".format(bmi)

                    if (bmi < 18.5) {
                        textBMI.append("\nYou are underweight.")
                    } else if (bmi < 25) {
                        textBMI.append("\nYou are normal weight.")
                    } else if (bmi < 30) {
                        textBMI.append("\nYou are overweight.")
                    } else {
                        textBMI.append("\nYou are obese.")
                    }
                }




            }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item1->{
                Toast.makeText(this, "about app",Toast.LENGTH_LONG).show()
                return true
            }

            R.id.item2->{
                Toast.makeText(this,"Bmi chart",Toast.LENGTH_LONG).show()
                return true
            }

            R.id.item3->{
                Toast.makeText(this,"^204854219",Toast.LENGTH_LONG).show()
                return true
            }


            else -> {
                R.id.item4->{
                    Toast.makeText(this,"Nothing ",Toast.LENGTH_LONG).show()
                    return true
                }
            }
        }
    }
}

