fun main() {
    val grade: Int = 90

    //when expression
    when(grade){
        90 -> println("Nice")
        80 -> println("Good")
        70 -> println("Good enough")
        else -> println("Try again")
    }

    //when expression with multiple option
    when(grade){
        90, 80, 70 -> println("Pass")
        else -> println("Try again")
    }

    //when expression in
    val gradeCheck: Array<Int> = arrayOf(90, 80, 70)
    when(grade){
        in gradeCheck -> println("Pass")
        !in gradeCheck -> println("Try Again")
    }

    //when expression is
    when(grade){
        is Int -> println("grade data type is string")
        !is Int -> println("grade data type is not string")
    }

    //when without variable
    when{
        grade == 90 -> println("nice")
        grade == 80 -> println("good")
        else -> println("try again")
    }



}