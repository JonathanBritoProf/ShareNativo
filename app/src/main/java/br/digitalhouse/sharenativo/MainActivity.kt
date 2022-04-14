package br.digitalhouse.sharenativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            //cria a intenção de compartilhar
            var intent = Intent(Intent.ACTION_SEND);
            //configura o tipo de informação a ser compartilhada
            intent.type = "text/plain"
            //cria um extra com o texto a ser enviado
            intent.putExtra(Intent.EXTRA_TEXT, "My app is Black")
            //inicia a tela de compartilhamento do proprio SO
            startActivity(intent)
        }

    }
}