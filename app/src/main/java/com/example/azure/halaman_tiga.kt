package com.example.azure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halaman_tiga : AppCompatActivity() {
    private lateinit var btnChange: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_tiga)

        btnChange = findViewById(R.id.massajenis)
        btnChange.setOnClickListener {
            startActivity(Intent(this, halaman_massajenis::class.java))
        }

        btnChange = findViewById(R.id.hukumohm)
        btnChange.setOnClickListener {
            startActivity(Intent(this, halaman_balok::class.java))
        }
    }
}
