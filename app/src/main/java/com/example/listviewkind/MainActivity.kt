package com.example.listviewkind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ListView=findViewById<ListView>(R.id.listview)
        val names= arrayOf("Jeremiah Well","Anabell Blue","Conrad Silver","Taylor Joy","Nick Hughman")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        ListView.adapter=arrayAdapter
        ListView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"You've clicked on "+names[position],Toast.LENGTH_LONG).show()

        }


   }
}