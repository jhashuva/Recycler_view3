package com.example.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var names = mutableListOf<String>("Joshua","Revanth","RAJ")
        var dobs = mutableListOf<String>("02061991","03061997","04012009")
        val button = findViewById<Button>(R.id.submit)
        val name = findViewById<EditText>(R.id.name)
        val dob = findViewById<EditText>(R.id.dob)

        val rv =findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        button.setOnClickListener(){
            names.add(name.text.toString())
            dobs.add(dob.text.toString())
            rv.adapter = MyAdaptor(names,dobs)
        }


    }
}