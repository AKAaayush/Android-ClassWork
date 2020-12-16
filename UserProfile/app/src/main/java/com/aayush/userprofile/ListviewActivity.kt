package com.aayush.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListviewActivity : AppCompatActivity() {
    private val countries = arrayOf(
            "Nepal", "India", "Chine"
    )

    private lateinit var lstView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        lstView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                countries
        )
        lstView.adapter = adapter
        //on item Click Listener

        lstView.setOnItemClickListener{parent, view, position, id ->
            val element = parent.getItemIdAtPosition(position).toString()
            Toast.makeText(this, element.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}