package array

fun main (){
    val arr = IntArray(size = 9)
    for(i in arr.indices){
        print("Enter an Element ")
        arr[i] = readLine()!!.toInt()
    }
    displayEvanNos(arr)

    displayOddnos(arr)

    displaySumnos(arr)
}

fun displaySumnos(arr: IntArray) {
    println ("Sum of odd numbers is : ")





}

fun displayOddnos(arr: IntArray) {
    println ("Odd numbers are : ")

    for ( i in arr.indices)
    {
        if(arr[i] % 2 == 1){
            println (arr[i])
        }
    }
}

fun displayEvanNos(arr: IntArray) {
println ("Even numbers are : ")

    for ( i in arr.indices)
    {
        if(arr[i] % 2 == 0){
            println (arr[i])
        }
    }
}
