package br.com.fiap.meubibliotecapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.fiap.minhabiblioteca.Calculadora

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculadora = Calculadora()
        val resultado = calculadora.somar(1, 2)
        Toast.makeText(this, resultado.toString(),
                Toast.LENGTH_LONG).show()

    }
}
