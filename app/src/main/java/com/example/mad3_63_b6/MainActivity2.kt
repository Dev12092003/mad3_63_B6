package com.example.mad3_63_b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    lateinit var text_header:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent=intent //here we get intent from main activity
        val bundle:String?=intent.getStringExtra("EXTRAMESSAGE")
        findViewById(R.id.import_text)
    }

}