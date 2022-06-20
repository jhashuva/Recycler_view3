package com.example.recyclerview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class MyAdaptor(val names: MutableList<String>, val dobs: MutableList<String>): RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView = row.findViewById<TextView>(R.id.name1)
        val textView2 = row.findViewById<TextView>(R.id.dob1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = names.get(position)
        holder.textView2.text = dobs.get(position)

    }

    override fun getItemCount(): Int = names.size
}