package com.aayush.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : AppCompatActivity() {
    private val languages = arrayOf("Nepali", "Hindi","English", "Chinese")
    private lateinit var spinner : Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinner = findViewById(R.id.spinner)
        //Array Adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            languages

        )

        //setting the adapter to spinner's adapter
        spinner.adapter = adapter
        //oOn item slected listerner on spinner
        spinner.onItemSelectedListener=
           object : AdapterView.OnItemSelectedListener{


               override fun onItemSelected(
                   parent: AdapterView<*>?,
                   view: View?,
                   position: Int,
                   id: Long
               ) {
                 val selectedItem = parent?.getItemAtPosition(position).toString()
                   Toast.makeText(
                       this@SpinnerActivity,
                       "Selected item : $selectedItem",
                       Toast.LENGTH_LONG
                   ).show()
               }

               override fun onNothingSelected(parent: AdapterView<*>?) {
                   TODO("Not yet implemented")
               }

           }

    }

}