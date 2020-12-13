package com.aayush.mygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import android.widget.Toast

class MainActivity : AppCompatActivity() {
 var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Run : Button = findViewById(R.id.Run)
        val Num1 : Button = findViewById(R.id.Num1)
        val Num2 : Button = findViewById(R.id.Num2)
        val Output1 : TextView  = findViewById(R.id.Output1)
        val Output2 : TextView = findViewById(R.id.Output2)
        val Again : Button = findViewById(R.id.Again)
        var Right :Int = 0;
        var Wrong : Int = 0;

        Run.setOnClickListener() {
            Run.visibility = View.INVISIBLE
            Num1.visibility=View.VISIBLE
            Num2.visibility=View.VISIBLE

            //Random Num
            val r1:Int = Random.nextInt(0, 100)
            val r2:Int = Random.nextInt(0, 100)

            if (r1 != r2)
            {
                Num1.text = r1.toString()
                Num2.text = r2.toString()

                Num1.setOnClickListener() {
                    count = count + 1

                    if(r1>r2){
                        Right++
                    }
                    else{
                        Wrong++
                    }

                    val r3 : Int= Random.nextInt(0, 100)
                    val r4 : Int = Random.nextInt(0, 100)

                    if (r3 != r4){
                        Num1.text = r3.toString()
                        Num2.text = r4.toString()
                    }

                    else{
                        Toast.makeText(this,"Result is hello", Toast.LENGTH_LONG).show()
                    }

                    if(count == 10){
                        Toast.makeText(this,"Result is $count ", Toast.LENGTH_LONG).show()
                        Output1.visibility = View.VISIBLE
                        Output2.visibility = View.VISIBLE
                        Again.visibility = View.VISIBLE

                        Output1.text = "Correct : $Right"
                        Output2.text = "InCorrect : $Wrong"

                        Num1.text = ""
                        Num2.text = ""

                        Num1.isEnabled = false
                        Num2.isEnabled = false

                        Again.setOnClickListener {
                            setContentView(R.layout.activity_main)
                        }
                    }


                }

                Num2.setOnClickListener {
                    count = count +1

                    if (r1 > r2){
                        Wrong ++
                    }
                    else{
                        Right++
                    }

                    val r5 : Int = Random.nextInt()
                    val r6 : Int = Random.nextInt()

                    if ( r5 != r6 ){
                        Num1.text = r5.toString()
                        Num2.text = r6.toString()
                    }

                    else{
                        Toast.makeText(this,"show again", Toast.LENGTH_LONG).show()
                    }

                    if (count == 10){
                        Toast.makeText(this,"Result is $count ", Toast.LENGTH_LONG).show()
                        Output1.visibility = View.VISIBLE
                        Output2.visibility = View.VISIBLE
                        Again.visibility = View.VISIBLE
                        Output1.text = "Correct : $Right"
                        Output2.text = "Incorrect : $Wrong"
                        Num1.isEnabled = false
                        Num2.isEnabled = false

                        Again.setOnClickListener {
                            setContentView(R.layout.activity_main)
                        }

                    }
                }

            }


        }
    }
}
