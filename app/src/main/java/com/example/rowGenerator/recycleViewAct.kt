package com.example.rowGenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*

class recycleViewAct() : AppCompatActivity(),itemClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        recycleView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter: ListAdapter= ListAdapter(items,this)
        recycleView.adapter = adapter
    }

    private fun fetchData(): ArrayList<String> {


        val list = ArrayList<String>()
        for (i: Int in 1 until (intent.getIntExtra("j",0))+1)
            list.add("Row $i")

        return list
    }
   override fun onItemClicked(item: String) {

        Toast.makeText(this, "$item", Toast.LENGTH_LONG).show()
    }
}
