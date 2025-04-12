package com.example.tarea3

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Asigna el layout de la actividad (pantalla de registro)
        setContentView(R.layout.registro)

        // Busca el botón para entrar a la tienda
        val btnEntrar = findViewById<Button>(R.id.btnEntrarTienda)

        // Configura el evento de clic para el botón
        btnEntrar.setOnClickListener {
            // Intent para abrir la pantalla del catálogo
            val intent = Intent(this, CatalogoActivity::class.java)
            // Inicia la actividad del catálogo
            startActivity(intent)
        }

    }
}