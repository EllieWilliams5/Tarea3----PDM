package com.example.tarea3

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.ActionBarDrawerToggle

/**
 * Representa la pantalla principal de la tienda.
 * Incluye un barra superior, un menu lateral y un menu de opciones.
 * Permite al usuario acceder a distintas secciones del catalogo o realizar acciones como
 */
class CatalogoActivity : AppCompatActivity() {

    // Referencias al layout del menú lateral
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Se asigna el layout XML de esta pantalla
        setContentView(R.layout.activity_catalogo)

        // Se configura la barra superior personalizada
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Se vinculan los elementos del DrawerLayout y NavigationView
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)

        // Configura el ícono  para abrir/cerrar el menu lateral
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Maneja las opciones seleccionadas del menú lateral.
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_inicio -> {
                    Toast.makeText(this, "Inicio seleccionado", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_perfil -> {
                    Toast.makeText(this, "Perfil seleccionado", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_videojuegos -> {
                    Toast.makeText(this, "Videojuegos seleccionados", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_figuras -> {
                    Toast.makeText(this, "Figuras seleccionadas", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_comics -> {
                    Toast.makeText(this, "Cómics seleccionados", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_libros -> {
                    Toast.makeText(this, "Libros seleccionados", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_carrito -> {
                    Toast.makeText(this, "Carrito seleccionado", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_cerrar -> {
                    Toast.makeText(this, "Cerrando sesión...", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
            drawerLayout.closeDrawers()
            true
        }
    }

    // Menu de 3 puntitos en la parte superior derecha.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_catalogo, menu)
        return true
    }


     // Maneja las acciones seleccionadas del menú de 3 puntitos.
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_comprar -> {
                Toast.makeText(this, "Opción: Comprar", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_modificar -> {
                Toast.makeText(this, "Opción: Modificar Pedido", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_cancelar -> {
                Toast.makeText(this, "Opción: Cancelar Pedido", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_monitorear -> {
                Toast.makeText(this, "Opción: Monitorear mi pedido", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_dudas -> {
                Toast.makeText(this, "Opción: Dudas", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_comentarios -> {
                Toast.makeText(this, "Opción: Comentarios y/o quejas", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
