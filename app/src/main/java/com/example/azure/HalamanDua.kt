package com.example.azure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HalamanDua : AppCompatActivity() {
    private lateinit var btnChange: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)

        btnChange = findViewById(R.id.balok)
        btnChange.setOnClickListener {
            startActivity(Intent(this, halaman_balok::class.java))
        }

        btnChange = findViewById(R.id.kubus)
        btnChange.setOnClickListener {
            startActivity(Intent(this, halaman_kubus::class.java))
        }

        btnChange = findViewById(R.id.bola)
        btnChange.setOnClickListener {
            startActivity(Intent(this, HalamanDua::class.java))
        }

        btnChange = findViewById(R.id.kerucut)
        btnChange.setOnClickListener {
            startActivity(Intent(this, HalamanDua::class.java))
        }

        btnChange = findViewById(R.id.tabung)
        btnChange.setOnClickListener {
            startActivity(Intent(this, HalamanDua::class.java))
        }
    }
}
