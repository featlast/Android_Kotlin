package com.example.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Método Btn 2
        val btnCambiarColor : Button = findViewById(R.id.btn_secundario)
        //agregar un listener
        btnCambiarColor.setOnClickListener{
            val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
            txtPrincipal.setTextColor(android.graphics.Color.BLUE)
        }

    }
    /*Método del btn 1*/
    fun cambiarColor (view:View){
    val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
        txtPrincipal.setTextColor(android.graphics.Color.GREEN)
    }

    /*Edit text*/
    fun cambiarTexto (view: View){
    val etPrincipal: EditText = findViewById(R.id.et_txt_principal)
        val txtPrincipal: TextView = findViewById(R.id.tv_txt_principal)
        txtPrincipal.setText(etPrincipal.text)
    }
}