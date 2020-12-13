package com.example.vkshop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.adidas_icon, "Adidas", "Открытая группа"))
        list.add(ListItem(R.drawable.nike_icon, "Nike", "Открытая группа"))
        list.add(ListItem(R.drawable.puma_icon, "Puma", "Открытая группа"))
        list.add(ListItem(R.drawable.reebok_icon, "Reebok", "Открытая группа"))
        brandView.hasFixedSize()
        brandView.layoutManager = LinearLayoutManager(this)
        brandView.adapter = MyAdapter(list, this)
        brandView.adapter = MyAdapter(list, this)
    }
}
