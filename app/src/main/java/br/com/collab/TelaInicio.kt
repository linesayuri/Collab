package br.com.collab

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class TelaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicio)


        val buttonCompartilhar = findViewById<Button>(R.id.btn_compartilhar)

        buttonCompartilhar.setOnClickListener {
            PopupMenu(this@TelaInicio, buttonCompartilhar).apply {
                menuInflater.inflate(R.menu.menu_compartilhar, this.menu)
                setOnMenuItemClickListener {
                    //logica
                    Toast.makeText(this@TelaInicio, "${it.itemId}, ${it.title}", Toast.LENGTH_SHORT).show()
                    true
                }
                show()
            }
        }


        val buttonMenu = findViewById<ImageButton>(R.id.btn_menu)

        buttonMenu.setOnClickListener {
            PopupMenu(this@TelaInicio, buttonMenu).apply {
                menuInflater.inflate(R.menu.menu_opcoes, this.menu)
                setOnMenuItemClickListener {
                    //logica
                    Toast.makeText(this@TelaInicio, "${it.itemId}, ${it.title}", Toast.LENGTH_SHORT).show()
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
