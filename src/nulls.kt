//Nulls

fun main() {
    var x:Int? = 100 //it can be null
//    x=null

    println(x?.toFloat())
    if (x != null){
      var result = x * x
      println(result)
  }

    var result = x!! * x
    println(result)







}