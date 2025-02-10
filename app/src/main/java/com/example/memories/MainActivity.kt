package com.example.memories

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var listem = arrayListOf<String>("emre","ali","murat","adem","karabulut","özgül")
        var bosListe = listOf<String>()
        var i = 0
        var j =0
        var x =0

        for( i in listem.size){
            bosListe=listem[i].lowercase()
            i++
        }

       for (x in bosListe.size){
            if(bosListe.contains("a")){
            j++ }
                   x++
        }
        for (i in bosListe.size){
        println(bosListe[i])}
    }
}