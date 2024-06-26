package br.com.collab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelaObjetivos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_objetivos)


//        val btnobj1: ImageButton = findViewById(R.id.btn_obj_1)
//
//        val btnobj1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://brasil.un.org/pt-br/sdgs/1"))
//        startActivity(i)
//
//
//

        val btnobj1 = findViewById<ImageButton>(R.id.btn_obj_1)
        btnobj1?.setOnClickListener {


            val url = "https://brasil.un.org/pt-br/sdgs/1"
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(url)
                )
            )


         }

        val buttonMenu = findViewById<ImageButton>(R.id.btn_menu)

        buttonMenu.setOnClickListener {
            PopupMenu(this@TelaObjetivos, buttonMenu).apply {
                menuInflater.inflate(R.menu.menu_opcoes, this.menu)
                setOnMenuItemClickListener {
                    //logica
                    Toast.makeText(this@TelaObjetivos, "${it.itemId}, ${it.title}", Toast.LENGTH_SHORT).show()
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
