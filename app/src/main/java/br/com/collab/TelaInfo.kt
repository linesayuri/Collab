package br.com.collab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
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



        val buttonMenu = findViewById<ImageButton>(R.id.btn_menu)

        buttonMenu.setOnClickListener {
            PopupMenu(this@TelaInfo, buttonMenu).apply {
                menuInflater.inflate(R.menu.menu_opcoes, this.menu)
                setOnMenuItemClickListener {
                    //logica
                    Toast.makeText(this@TelaInfo, "${it.itemId}, ${it.title}", Toast.LENGTH_SHORT).show()
                    true
                }
                show()
            }
        }


        val btnInicio: ImageButton = findViewById(R.id.btn_inicio)

        btnInicio.setOnClickListener {
            val i = Intent(this, TelaInicio::class.java)
            startActivity(i)
        }

        val btnForum: ImageButton = findViewById(R.id.btn_forum)

        btnForum.setOnClickListener {
            val i = Intent(this, TelaForum::class.java)
            startActivity(i)
        }

        val btnInfo: ImageButton = findViewById(R.id.btn_info)

        btnInfo.setOnClickListener {
            val i = Intent(this, TelaInfo::class.java)
            startActivity(i)
        }

    }
}