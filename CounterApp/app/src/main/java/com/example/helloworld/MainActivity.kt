package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val btnClickMe2 = findViewById<Button>(R.id.mybutton2)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener { //increase counter
            timesClicked += 1
            tvMyTextView.text = timesClicked.toString();
            Toast.makeText(this, "Increased!", Toast.LENGTH_LONG).show()
        }
        btnClickMe2.setOnClickListener { //decrease counter
            timesClicked -= 1
            tvMyTextView.text = timesClicked.toString();
            Toast.makeText(this, "Decreased!", Toast.LENGTH_LONG).show()
        }

    }
}