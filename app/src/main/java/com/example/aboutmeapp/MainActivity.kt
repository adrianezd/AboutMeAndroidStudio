package com.example.aboutmeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button4)
        var label = findViewById<TextView>(R.id.textView4)
        var textoNombre = findViewById<EditText>(R.id.editTextTextPersonName)
        btn.setOnClickListener{
            if(textoNombre.text.toString().isNullOrBlank()){
                textoNombre.hint = R.string.edittextDefecto.toString()
        }else{
            textoNombre.visibility = View.GONE
            label.visibility = View.VISIBLE
            label.text = textoNombre.text
            btn.visibility = View.GONE
            var teclado=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            teclado.hideSoftInputFromWindow(it.windowToken , 0)
        }
        label.setOnClickListener{
            btn.visibility= View.VISIBLE
            textoNombre.text.clear()
            textoNombre.visibility = View.VISIBLE
            label.visibility = View.GONE
        }

    }
}}