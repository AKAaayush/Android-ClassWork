package com.aayush.userprofile

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class DatepickerActivity : AppCompatActivity() {

    private lateinit var btnLoadCalender:Button
    private lateinit var tvDate : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)

        btnLoadCalender = findViewById(R.id.btnLoadCalender)
        tvDate = findViewById(R.id.tvDate)

        btnLoadCalender.setOnClickListener {
            LoadCalendar()
        }
    }

    private fun LoadCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                tvDate.text = "Slected Date : $dayOfMonth/$monthOfYear/$year"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }



}


