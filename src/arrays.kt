fun main() {

    //immutable===it means they are permanent
    var scores = listOf(67,87,10,98,90,45,34,54,45,54,67,55)

    var names = listOf("james","jack","jim","jully","justin")

    println(scores[1])//second score
    println(names[3])//fourth name

    //add
    names.plus("jeremy")

    println(names)

//mutable====it means they are not permanent "u can change"
    var marks = arrayListOf(10,34,56,78,98,90,67,55,43,23)
    println(marks[4])

    marks.add(99)
    marks.remove(23)

    println(marks)

//    marks.size
//    marks.clear()
//    marks.first()


    //LOOP
    for (m in marks){
        println(m)
    }

    for (m in marks){
        if (m% 2 == 0)
            println(m)
    }







}