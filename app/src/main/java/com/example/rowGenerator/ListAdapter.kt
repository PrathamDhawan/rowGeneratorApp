package com.example.rowGenerator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class ListAdapter(private val items: ArrayList<String>, private val listener: itemClicked): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_items, parent, false)
        val viewHolder = ViewHolder(view)

        view.setOnClickListener {
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = items[position]
        holder.titleView.text = currentItem
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    val titleView: TextView = itemView.findViewById(R.id.title)

}


interface itemClicked{

    fun onItemClicked(item: String)
}