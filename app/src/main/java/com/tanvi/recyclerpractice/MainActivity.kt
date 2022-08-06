package com.tanvi.recyclerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val  myList = mutableListOf<ModelClass>()
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView)
        initData()
        setRV()
    }
    fun initData(){
        val model1 = ModelClass(R.drawable.iv1,"Tanvi","09:15 PM","what r u doing")
        myList.add(model1)

        val model2 = ModelClass(R.drawable.iv2,"Tanvi","11:00 PM","Hi, how are you?")
        myList.add(model2)

        val model3 = ModelClass(R.drawable.iv3,"Manisha","4:15 AM","mere bhai ka peecha chod")
        myList.add(model3)

        val model4 = ModelClass(R.drawable.iv4,"Ravi","11:00 PM","Dont leave ")
        myList.add(model4)

    }

    fun setRV(){
       // 1. layout manager
        recyclerView.layoutManager =LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        //2. apd
        val adapter = Adapter(myList)
        recyclerView.adapter = adapter

    }
}