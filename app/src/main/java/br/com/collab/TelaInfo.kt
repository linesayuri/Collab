package br.com.collab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_info)


        val btnObjetivos: Button = findViewById(R.id.btn_objetivos)

        btnObjetivos.setOnClickListener {
            val i = Intent(this, TelaObjetivos::class.java)
            startActivity(i)
        }

        val btnDoacaoAlimentos: Button = findViewById(R.id.btn_doacao_alimentos)

        btnDoacaoAlimentos.setOnClickListener {
            val i = Intent(this, TelaDoacao::class.java)
            startActivity(i)
        }



    }
}