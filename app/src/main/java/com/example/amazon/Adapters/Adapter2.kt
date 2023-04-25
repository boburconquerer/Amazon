package com.example.amazon.Adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.Models.Model2
import com.example.amazon.R

class Adapter2(var list2: ArrayList<Model2>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false)
        return SecondViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model2: Model2 = list2[position]
        if(holder is SecondViewHolder){
            holder.ctitle.text = model2.ctitle
            holder.pic1.setImageResource(R.drawable.joystick)
            holder.pic2.setImageResource(R.drawable.joystick)
            holder.pic3.setImageResource(R.drawable.joystick)
            holder.pic4.setImageResource(R.drawable.joystick)
        }
    }

    inner class SecondViewHolder(view: View): RecyclerView.ViewHolder(view){
        var ctitle: TextView = view.findViewById(R.id.cText)
        var pic1: ImageView = view.findViewById(R.id.pic1)
        var pic2: ImageView = view.findViewById(R.id.pic2)
        var pic3: ImageView = view.findViewById(R.id.pic3)
        var pic4: ImageView = view.findViewById(R.id.pic4)
    }
}