package com.example.azure

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class halaman_massajenis : AppCompatActivity() {
    private lateinit var edtMassa: EditText
    private lateinit var edtVolume: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_massajenis)

        edtMassa = findViewById(R.id.edt_massa)
        edtVolume = findViewById(R.id.edt_volume)
        btnHitung = findViewById(R.id.btn_hitung)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(View.OnClickListener {
            val massa = edtMassa.text.toString().toDouble()
            val volume = edtVolume.text.toString().toDouble()
            val MassaJenis = massa/volume
            tvHasil.setText(MassaJenis.toString())
        })
    }
}
