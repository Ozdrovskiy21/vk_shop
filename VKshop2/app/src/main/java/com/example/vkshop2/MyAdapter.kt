package com.example.vkshop2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(listArray:ArrayList<ListItem>, context: Context): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var listArrayR= listArray
    var contextR= context


    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val textBrand = view.findViewById<TextView>(R.id.textBrand)
        val openGroup = view.findViewById<TextView>(R.id.openGroup)
        val imageBrand = view.findViewById<ImageView>(R.id.imageBrand)
        fun bind(listItem:ListItem, context:Context)
        {
            textBrand.text = listItem.textBrand
            openGroup.text = listItem.openGroup
            imageBrand.setImageResource(listItem.imageBrand)
            itemView.setOnClickListener()
            {
                Toast.makeText(context, "Pressed : ${textBrand.text}", Toast.LENGTH_SHORT).show()
                val i = Intent(context, ProductList::class.java)
                context.startActivity(i)
            }
        }


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listArrayR.get(position)
        holder.bind(listItem, contextR)
    }
}