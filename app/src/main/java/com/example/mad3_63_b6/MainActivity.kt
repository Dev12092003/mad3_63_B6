package com.example.mad3_63_b6

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    lateinit var mmessage_edit_text:EditText
    val EXTRAMESSAGE="com.example.mad3_63_b6.message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //same as int a;
        mmessage_edit_text=findViewById(R.id.edit_text) //for finding edit_text in xml file
    }
    // calll alter + enter


    fun SecondActivity(view: View) {
        //Log.i(tag,"called")

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("MainActivity",EXTRAMESSAGE)
        var message=mmessage_edit_text.text.toString()
        startActivity(intent)
    }
//    val EXTRAMESSAGE="com.example.mad3_63_b6.message"
//    lateinit var messagedittext:EditText
}