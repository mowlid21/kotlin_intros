//functions

fun main() {
   var text = "The quick brown fox jumped over a lazy dog"
    println(text.toUpperCase())
    var upper = text. toUpperCase()
    println(upper)

    print("Please enter your age:")
    var age = readLine()

    print("Your Age is $age")
    println("Enter Your Full Name")
    var name = readLine()

    var splitted = name?.split(" ")
    var firstName = splitted?.get(0)  //the qns mark is a null check
    var lastName = splitted?.get(1)

    println("You First Name is $firstName and Your Surname is $lastName")

}