package com.example.azure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Beranda : AppCompatActivity() {
    private lateinit var btnChange: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        btnChange = findViewById(R.id.SD)
        btnChange.setOnClickListener {
            startActivity(Intent(this, HalamanDua::class.java))
        }

        btnChange = findViewById(R.id.SMP)
        btnChange.setOnClickListener {
            startActivity(Intent(this, halaman_tiga::class.java))
        }

    }
}
