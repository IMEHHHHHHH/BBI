package com.example.beratbadaideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var input_nama: EditText
    private lateinit var input_tinngiBadan: EditText
    private lateinit var rb_LakiLaki: RadioButton
    private lateinit var rb_perempuan: RadioButton
    private lateinit var t_hasil: TextView
    private lateinit var b_processing: Button

    private var tb: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input_nama = findViewById(R.id.etName)
        input_tinngiBadan = findViewById(R.id.etBB)
        rb_LakiLaki = findViewById(R.id.rbLK)
        rb_perempuan = findViewById(R.id.rbPR)
        t_hasil = findViewById(R.id.tvHasil)
        b_processing = findViewById(R.id.BTprs)

        b_processing.setOnClickListener {
            var tinggi = input_tinngiBadan.text.toString().toInt()

            if (rb_LakiLaki.isChecked) {
                tb = (tinggi - 100) - ((tinggi - 100) * 10 / 100)
                t_hasil.setText(tb.toString() + "kg")
            } else {
                tb = (tinggi - 100) - ((tinggi - 100) * 15 / 100)
                t_hasil.setText(tb.toString() + "kg")
            }
        }
    }
}