    package com.example.azure

    import android.support.v7.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView

    class halaman_balok : AppCompatActivity() {

        private lateinit var edtPanjang: EditText
        private lateinit var edtLebar: EditText
        private lateinit var edtTinggi: EditText
        private lateinit var btnHitung: Button
        private lateinit var tvHasil: TextView
        private lateinit var tvHasil2: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_halaman_balok)


            edtPanjang = findViewById(R.id.edt_panjang)
            edtLebar = findViewById(R.id.edt_lebar)
            edtTinggi = findViewById(R.id.edt_tinggi)
            btnHitung = findViewById(R.id.btn_hitung)
            tvHasil = findViewById(R.id.tv_hasil)
            tvHasil2 = findViewById(R.id.tv_hasil2)

            btnHitung.setOnClickListener(View.OnClickListener {
                val panjang = edtPanjang.text.toString().toDouble()
                val lebar = edtLebar.text.toString().toDouble()
                val tinggi = edtTinggi.text.toString().toDouble()
                val Volume = panjang*lebar*tinggi
                val Luas = panjang*lebar
                tvHasil.setText(Volume.toString())
                tvHasil2.setText(Luas.toString())

            })
        }
    }
