package com.example.cursoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "MensajeActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Obtener valores de los input*/
        val num1 : EditText = findViewById(R.id.et_num1)
        val num2 : EditText = findViewById(R.id.et_num2)
        val tvResultado : TextView = findViewById(R.id.tv_resultado)

        /*Obtener Valores de los radio Button*/
        val rbSuma= findViewById<RadioButton>(R.id.rb_suma)
        val rbResta: RadioButton = findViewById(R.id.rb_resta)

        //CheckBox
        val cbDivision : CheckBox = findViewById(R.id.cb_division)
        val cbMultiplicacion : CheckBox = findViewById(R.id.cb_multiplicacion)




        val btnRes : Button = findViewById(R.id.btn_resultado)
        btnRes.setOnClickListener {

            var res =""

            if(rbSuma.isChecked) {
                tvResultado.text =
                    "Resultado=> ${num1.text.toString().toInt() + num2.text.toString().toInt()}"
                Toast.makeText(this, "La Suma Es=>${tvResultado.text}", Toast.LENGTH_LONG).show()
            }
            if(rbResta.isChecked) {
                tvResultado.text =
                    "Resultado=> ${num1.text.toString().toInt() - num2.text.toString().toInt()}"
                Toast.makeText(this, "La Resta Es =>${tvResultado.text}", Toast.LENGTH_LONG).show()
            }
            if(cbMultiplicacion.isChecked){
                res="Multiplicacion => ${num1.text.toString().toInt() * num2.text.toString().toInt()}"
            }
            if(cbDivision.isChecked){
                res+="Division => ${num1.text.toString().toInt() / num2.text.toString().toInt()}"
            }

            tvResultado.text=res
        }

    }


}