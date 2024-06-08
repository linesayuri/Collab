package br.com.collab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
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

        }
    }
