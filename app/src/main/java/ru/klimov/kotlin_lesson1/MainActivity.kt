package ru.klimov.kotlin_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("myLogs", human1.name)
        Log.d("myLogs","${human1.age}")
        Log.d("myLogs", human2.name)
        Log.d("myLogs","${human2.age}")
        val textView: TextView = findViewById(R.id.TextView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = "Привет!"
        }
        for(i in 1..10){
            Log.d("myLogs", "$i")
        }

        for(i in 1..20 step 2){
            Log.d("myLogs", "$i")
        }
    }
    data class Human(val name: String, val age: Int)
    val human1 = Human("Oleg", 25)
    val human2 = human1.copy(name = "Sergey")

}