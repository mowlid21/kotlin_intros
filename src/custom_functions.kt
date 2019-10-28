fun main() {
   volume(10f,7f)
    volume(55.56f,71.99f)


    surface_area(20f,10f)
    surface_area(14.5f,12.56f)


    println(splitName("Zack Nana"))
    println(splitName("Ikram Mohamed"))


    println(add(10,20,30))
    println(add(20,20))




}

//SOLID PRINCIPLES
fun volume(height:Float,radius:Float){
    var v = 22/7 * height * radius * radius
    println("volume of the cylinder is $v")

}

fun surface_area (height: Float,radius: Float) {
    var surface_area = 2 * 22/7 * radius * height + 2 * 22/7 * radius * radius
    println("surface area of the cylinder is $surface_area")
}

fun splitName(fullName: String) : List<String> {
    var splitted = fullName.split(" ")
    return splitted
}

fun add(a:Int,b:Int,c:Int=0) : Int {
    return a + b + c
}