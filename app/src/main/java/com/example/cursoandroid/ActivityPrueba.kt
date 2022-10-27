package com.example.cursoandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityPrueba : AppCompatActivity() {
    val EXTRA_MESSAGE = "MensajeActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba)

        val mensaje = intent.getStringExtra(EXTRA_MESSAGE)
        val textViewPrueba = findViewById<TextView>(R.id.tv_txt_prueba).apply { text = mensaje }
    }

    fun goBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}