package com.example.cursoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "MensajeActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*List View*/
        val listaPaises : ListView = findViewById(R.id.lv_paises)
        val paises = arrayOf("Colombia", "Mexico", "Argentina", "Chile", "Brazil", "Uruguay", "Paraguay", "Venezuela", "Bolivia", "Peru", "Ecuador")
        val adaptadorPaises = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises)
        val poblaciones = arrayOf(5_000_000, 10_000_000, 8_000_000, 100_000_000, 80_000_000,5_000_000, 10_000_000, 8_000_000, 100_000_000, 80_000_000 ,10_000_000)
        val duration = Toast.LENGTH_SHORT
        listaPaises.adapter = adaptadorPaises
        listaPaises.setOnItemClickListener{ adapterView, view, i , l->
            Toast.makeText(applicationContext,"Población :${poblaciones[i]}",duration).show()
        }

    val btnCall : ImageButton=findViewById(R.id.btn_call)
        btnCall.setOnClickListener{
            Toast.makeText(applicationContext,"Llamando...", Toast.LENGTH_LONG).show()
        }
    }


}