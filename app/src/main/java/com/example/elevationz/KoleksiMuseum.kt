package com.example.elevationz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class KoleksiMuseum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koleksi_museum)

        //for button clicking
        var pilih = findViewById<Button>(R.id.pilih)
        pilih.setOnClickListener {
            val intent = Intent(this, KelilingMuseum::class.java)
            startActivity(intent)
        }
        var homebbutton = findViewById<ImageButton>(R.id.homeicon)
        homebbutton.setOnClickListener {
            var takemehome = Intent(this, MainActivity::class.java)
            startActivity(takemehome)
        }

        var backtodesc = findViewById<ImageButton>(R.id.backtodesc)
        backtodesc.setOnClickListener {
            var backdesc = Intent(this, DeskripsiMuseum::class.java)
            startActivity(backdesc)
        }

    }
}