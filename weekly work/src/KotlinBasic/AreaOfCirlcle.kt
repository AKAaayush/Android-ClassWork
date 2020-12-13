package KotlinBasic// Area of circle

fun main(){
    print("Enter radius :")
    val radius = readLine()!!.toFloat()
    val area = calculateAreaOfCircle(_radius = radius)
    print("Area of $radius is $area")

}

fun calculateAreaOfCircle(pi : Float = 3.14F, _radius : Float): Float{
    return pi*_radius*_radius
}