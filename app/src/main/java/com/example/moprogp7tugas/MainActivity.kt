package com.example.moprogp7tugas

//Aferil Yudhatama
//211250786

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var panjang: Double? = null
    var lebar: Double? = null
    var luas: Double? = null
    var keliling: Double? = null

    private lateinit var btnIntentPP: Button
    private lateinit var btnIntentP: Button
    private lateinit var btnIntentS: Button
    private lateinit var btnIntentL: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val panjang = findViewById<EditText>(R.id.panjang)
        val lebar = findViewById<EditText>(R.id.lebar)
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

        btnHitung.setOnClickListener {
            val panjang = panjang.getText().toString().toDouble()
            val lebar = lebar.getText().toString().toDouble()

            val Luas = panjang * lebar
            hasilLuas.setText("$Luas")

            val Keliling = panjang + lebar + panjang + lebar
            hasilKeliling.setText("$Keliling")
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnPPanjang -> run {
                    val intentBiasa = Intent(this@MainActivity, MainActivity::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnPersegi -> run {
                    val intentBiasa = Intent(this@MainActivity, MainActivityP::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnSegitiga -> run {
                    val intentBiasa = Intent(this@MainActivity, MainActivityS::class.java)
                    startActivity(intentBiasa)
                }

                R.id.btnLingkaran -> run {
                    val intentBiasa = Intent(this@MainActivity, MainActivityL::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}