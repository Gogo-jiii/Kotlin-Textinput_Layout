package com.example.textinputlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            val text = textInputLayoutError.editText!!.text.toString()
            if (text.isEmpty()) {
                textInputLayoutError.error = "Field can't be empty"
            } else {
                textInputLayoutError.error = null
            }
        }
    }
}