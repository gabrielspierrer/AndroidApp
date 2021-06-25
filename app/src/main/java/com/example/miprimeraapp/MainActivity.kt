package com.example.miprimeraapp


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com.example.miprimeraapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun verFragmentRojo(view: View) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, BlankFragment1()).commit()
    }

    fun verFragmentAzul(view: View) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, BlankFragment2()).commit()
    }

}