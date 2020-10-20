package com.example.rowGenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            var j = Integer.parseInt(input.editableText.toString())
            val intent = Intent(this,recycleViewAct::class.java)
            intent.putExtra("j",j)
            startActivity(intent)
        }
    }
}