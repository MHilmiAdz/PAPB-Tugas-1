package com.example.tugas2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Layout3 : AppCompatActivity(), View.OnClickListener {
    //declarative variable

    private lateinit var firstname: EditText
    private lateinit var lastname: EditText
    private lateinit var nameinput: TextView
    private lateinit var hasil: TextView
    private lateinit var showhasil: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_layout3)

        firstname = findViewById(R.id.firstname)
        lastname = findViewById(R.id.lastname)
        nameinput = findViewById(R.id.nameinput)
        hasil = findViewById(R.id.hasil)
        showhasil = findViewById(R.id.showhasil)
        showhasil.setOnClickListener(this)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString("data")
            hasil.text = result
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == showhasil.id) {
                val res = firstname.text.toString() + " " + lastname.text.toString()
                hasil.text = res
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("data", hasil.text.toString())
    }
}