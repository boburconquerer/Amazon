package com.example.amazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.Adapters.Adapter
import com.example.amazon.Adapters.Adapter2
import com.example.amazon.Models.Model
import com.example.amazon.Models.Model2

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        RefreshData(data())

        recyclerView2 = findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = GridLayoutManager(this, 1)

        VerData(data2())
    }

    private fun VerData(data2: ArrayList<Model2>) {
        val adapter2 = Adapter2(data2)
        recyclerView2.adapter = adapter2
    }

    private fun data2(): ArrayList<Model2> {
        val list = ArrayList<Model2>()
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        list.add(Model2("Oculus joysticks collection",R.drawable.joystick,R.drawable.joystick,R.drawable.joystick,R.drawable.joystick))
        return list
    }

    private fun data(): ArrayList<Model> {
        val list = ArrayList<Model>()
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        list.add(Model("Oculus",R.drawable.joystick))
        return list
    }

    private fun RefreshData(data: ArrayList<Model>) {
        val adapter= Adapter(data)
        recyclerView.adapter = adapter
    }
}