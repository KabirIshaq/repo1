package com.example.myapplication12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMybutton = findViewById <Button>(R.id.my_button)
        val tvMytextview = findViewById <TextView>(R.id.my_textview)
        var timesClicked = 0


        btnMybutton.setOnClickListener{
            timesClicked = timesClicked +1

           tvMytextview.text = timesClicked.toString()
            Toast.makeText(this, "You clicked a button now ", Toast.LENGTH_LONG).show()


        }





    }
}