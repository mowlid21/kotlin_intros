fun main() {
    var age = 10
    if (age>19)
    {
        println("Mature")
    }
    else
    {
        println("Immature")
    }

    //-> means action/

    var score = 65
    when(score){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        in 50..59 -> println("E")
        else -> println("Fail")
    }


    var day = 4
    when(day){
        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Wednesday")
        4-> println("Thurday")
        5-> println("Friday")
        6-> println("Saturday")
        7-> println("Sunday")
        else-> println("Invalid day")

    }
}