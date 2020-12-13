package KotlinBasic

fun main(){
//    print("Hello World")

    print ("Enter IOT Marks :")
    val iot = readLine()!!.toInt()
    print ("Enter Android Marks :")
    val android = readLine()!!.toInt()
    print("Enter WebAPI Marks :")
    val webapi = readLine()!!.toInt()

    val totalmarks = iot + android + webapi

    val percentage = (totalmarks/300.toFloat())*100
    println ("Total marks $totalmarks")
    println("Percentage $percentage %")

    when{
        percentage>=60 -> println( "First Division")
        percentage>=50 -> println( "Second Division")
        percentage>=40 -> println( "Third Division")
        percentage<40 -> println( "Fail ")
    }

}
