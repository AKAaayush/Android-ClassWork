package com.aayush.userprofile

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class TimePickerActivity : AppCompatActivity() {
    private lateinit var btnLoadTimePicker: Button
    private lateinit var tvTime: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        btnLoadTimePicker = findViewById(R.id.btnLoadTimepicker)
        tvTime = findViewById(R.id.tvTime)

        btnLoadTimePicker.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                    this,
                    TimePickerDialog.OnTimeSetListener { view: TimePicker?, hour: Int, minute ->
                        tvTime.text = "$hour : $minute"
                    },
                    hour,
                    minute,
                    true

            )
            timePickerDialog.show()
        }
    }
}


