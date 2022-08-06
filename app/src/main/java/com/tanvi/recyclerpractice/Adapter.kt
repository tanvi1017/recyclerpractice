package com.tanvi.recyclerpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val myList:List<ModelClass>):RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageViewIV = itemView.findViewById<ImageView>(R.id.imageview1)
        val ed1Tv = itemView.findViewById<TextView>(R.id.ed_1)
        val ed2Tv = itemView.findViewById<TextView>(R.id.ed_2)
        val ed3Tv = itemView.findViewById<TextView>(R.id.ed_3)
        fun bind(imageView: Int, ed1:String,ed2:String,ed3:String){
            imageViewIV.setImageResource(imageView)
            ed1Tv.text = ed1
            ed2Tv.text = ed2
            ed3Tv.text = ed3
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val modelClass:ModelClass = myList[position]
        val image = modelClass.imageview1
        val ed1 = modelClass.ed_1
        val ed2 = modelClass.ed_2
        val ed3 = modelClass.ed_3
        holder.bind(image,ed1,ed2,ed3)
    }

    override fun getItemCount(): Int {
      return myList.size
    }
}