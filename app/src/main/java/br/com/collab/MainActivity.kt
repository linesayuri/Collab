package br.com.collab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)


        val btnLogin: Button = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val i = Intent(this, TelaInicio::class.java)
            startActivity(i)
        }


        val btnCadastro: Button = findViewById(R.id.btn_cadastro)

        btnCadastro.setOnClickListener {
            val i = Intent(this, TelaCadastro::class.java)
            startActivity(i)
        }

            }

        }