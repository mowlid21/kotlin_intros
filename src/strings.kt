fun main() {
    var sentence: String = "The quick brown for jumped over a lazy dog"
    println(sentence.length)
    println(sentence.toUpperCase())
//    sentence = sentence.toUpperCase() // changing the variable

    var poem = """

        THE QUICK BROWN FOR JUMPED OVER A LAZY DOG
        THE QUICK BROWN FOR JUMPED OVER A LAZY DOG
        THE QUICK BROWN FOR JUMPED OVER A LAZY DOG

    """.trimIndent()
    println(poem)

    var firstName = "john"
    var lastName = "Musa"

    var age = 43


    var fullName = firstName + " " + lastName

    var full_name = "$firstName $lastName $age"

    println(fullName)
    println(full_name)

}