package ies.teis.ejemplonavdrawdesdezero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.snackbar.Snackbar
import ies.teis.ejemplonavdrawdesdezero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.contenidoDelPrincipal.toolbarprincipal)

        val toggle = ActionBarDrawerToggle(
            this, binding.root, binding.contenidoDelPrincipal.toolbarprincipal,
            R.string.abrir,
            R.string.cerrar
        )
        binding.root.addDrawerListener(toggle)
        toggle.syncState()

        binding.contenidoDelPrincipal.btnContenidoprincipal.setOnClickListener {
            Toast.makeText(this, "Se presiono el boton", LENGTH_LONG).show()
        }
    }


}