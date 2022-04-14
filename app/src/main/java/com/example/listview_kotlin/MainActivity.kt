package com.example.listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var list:ListView
    val items=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list=findViewById(R.id.list)

        for (i in 0..20)
        {
            items.add(i)
        }
        val adapter=ArrayAdapter<Int>(this,android.R.layout.simple_list_item_1,items)

        list.adapter=adapter

    }
}