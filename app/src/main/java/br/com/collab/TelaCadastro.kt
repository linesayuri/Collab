package br.com.collab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_cadastro)

        val btnLoginGoogle: Button = findViewById(R.id.btn_login_google)

        btnLoginGoogle.setOnClickListener {
            val i = Intent(this, TelaInicio::class.java)
            startActivity(i)
        }


        val btnCadastrar: Button = findViewById(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener {
            val i = Intent(this, TelaInicio::class.java)
            startActivity(i)
        }


    }

}