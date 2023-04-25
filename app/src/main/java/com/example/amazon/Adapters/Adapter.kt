package com.example.amazon.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.Models.Model
import com.example.amazon.R

class Adapter(var list: ArrayList<Model>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item1,parent,false)
        return HorData(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: Model = list[position]
        if(holder is HorData){
            holder.title.text = model.title1
            holder.image.setImageResource(R.drawable.joystick)
        }
    }

    inner class HorData(view: View): RecyclerView.ViewHolder(view){
        var title: TextView = view.findViewById(R.id.title1)
        var image: ImageView = view.findViewById(R.id.image1)
    }
}

