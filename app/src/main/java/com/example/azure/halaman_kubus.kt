package com.example.azure

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class halaman_kubus : AppCompatActivity() {

    private lateinit var edtSisi1: EditText
    private lateinit var edtSisi2: EditText
    private lateinit var edtSisi3: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView
    private lateinit var tvHasil2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_kubus)

        edtSisi1 = findViewById(R.id.edt_sisi1)
        edtSisi2 = findViewById(R.id.edt_sisi2)
        edtSisi3 = findViewById(R.id.edt_sisi3)
        btnHitung = findViewById(R.id.btn_hitung)
        tvHasil = findViewById(R.id.tv_hasil)
        tvHasil2 = findViewById(R.id.tv_hasil2)

        btnHitung.setOnClickListener(View.OnClickListener {
            val sisi1 = edtSisi1.text.toString().toDouble()
            val sisi2 = edtSisi2.text.toString().toDouble()
            val sisi3 = edtSisi3.text.toString().toDouble()
            val Volume = sisi1*sisi2*sisi3
            val Luas = 6*sisi1*sisi2
            tvHasil.setText(Volume.toString())
            tvHasil2.setText(Luas.toString())

        })
    }
}
