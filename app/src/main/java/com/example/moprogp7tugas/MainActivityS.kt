package com.example.moprogp7tugas

//Aferil Yudhatama
//211250786

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivityS : AppCompatActivity(), View.OnClickListener {

    var alas: Double? = null
    var tinggi: Double? = null
    var sisiC: Double? = null
    var luas: Double? = null
    var keliling: Double? = null

    private lateinit var btnIntentPP: Button
    private lateinit var btnIntentP: Button
    private lateinit var btnIntentS: Button
    private lateinit var btnIntentL: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_s)

        val alas = findViewById<EditText>(R.id.alas)
        val tinggi = findViewById<EditText>(R.id.tinggi)
        val sisiB = findViewById<EditText>(R.id.sisiB)
        val sisiC = findViewById<EditText>(R.id.sisiC)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val hasilLuas = findViewById<EditText>(R.id.hasilLuas)
        val hasilKeliling = findViewById<EditText>(R.id.hasilKeliling)

        btnIntentPP = findViewById(R.id.btnPPanjang)
        btnIntentPP.setOnClickListener(this)
        btnIntentP = findViewById(R.id.btnPersegi)
        btnIntentP.setOnClickListener(this)
        btnIntentS = findViewById(R.id.btnSegitiga)
        btnIntentS.setOnClickListener(this)
        btnIntentL = findViewById(R.id.btnLingkaran)
        btnIntentL.setOnClickListener(this)

        btnHitung.setOnClickListener{
            val alas = alas.getText().toString().toDouble()
            val tinggi = tinggi.getText().toString().toDouble()
            val sisiB = sisiB.getText().toString().toDouble()
            val sisiC = sisiC.getText().toString().toDouble()

            val Luas = 0.5 * alas * tinggi
            hasilLuas.setText("$Luas")

            val Keliling = alas + sisiB + sisiC
            hasilKeliling.setText("$Keliling")
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnPPanjang -> run {
                    val intentBiasa = Intent(this@MainActivityS, MainActivity::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnPersegi -> run {
                    val intentBiasa = Intent(this@MainActivityS, MainActivityP::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnSegitiga -> run {
                    val intentBiasa = Intent(this@MainActivityS, MainActivityS::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnLingkaran -> run {
                    val intentBiasa = Intent(this@MainActivityS, MainActivityL::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}