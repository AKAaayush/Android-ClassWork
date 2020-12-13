package array
 fun main ()
 {
     //int[] arr = new Int[5]
     //int[] arr = {1,2,3,4,5,6}

     //kotlin array
     val arr = IntArray(size = 5)

     for(i in arr.indices){
        print("Enter an Element ")
         arr[i] = readLine()!!.toInt()
     }
     println("Array elements are ")
     for (i in arr.indices){
         println(arr[i])
     }


 }