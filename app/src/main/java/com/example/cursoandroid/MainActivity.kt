package com.example.cursoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "MensajeActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Método Btn 2
        val btnCambiarColor: Button = findViewById(R.id.btn_secundario)
        //agregar un listener
        btnCambiarColor.setOnClickListener {
            val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
            txtPrincipal.setTextColor(android.graphics.Color.BLUE)
        }

        val rb1= findViewById<RadioButton>(R.id.rb_suma)
        val rb2: RadioButton = findViewById(R.id.rb_resta)

        val btnRes : Button = findViewById(R.id.btn_resultado)
        btnRes.setOnClickListener {
            if(rb1.isChecked)  Toast.makeText(this,"Suma!",Toast.LENGTH_LONG).show()
            if(rb2.isChecked)  Toast.makeText(this,"Resta!",Toast.LENGTH_LONG).show()
        }

    }

    /*Método del btn 1*/
    fun cambiarColor(view: View) {
        val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
        txtPrincipal.setTextColor(android.graphics.Color.GREEN)
    }

    /*Edit text*/
    fun cambiarTexto(view: View) {
        val etPrincipal: EditText = findViewById(R.id.et_txt_principal)
        val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
        txtPrincipal.setText(etPrincipal.text)

        Toast.makeText(applicationContext, etPrincipal.text, Toast.LENGTH_LONG).show()
    }

    /*Btn Enviar Mensaje Intent*/
    fun enviarMensaje(view: View) {
        val etPrincipal: EditText = findViewById(R.id.et_txt_principal)
        val msj = etPrincipal.text.toString()
        val intent = Intent(this, ActivityPrueba::class.java).apply {
            putExtra(EXTRA_MESSAGE, msj)
        }
        startActivity(intent)
    }
}