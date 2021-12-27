fun main() {
    val anonymousUpper = fun(value: String): String{
        if(value.isBlank()){
            return "your input is empty"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("", anonymousUpper))

    //insert directly as a parameter
    println(hello("", fun(value: String): String{
        if (value.isBlank()){
            return "your input is empty"
        }else{
            return value.toUpperCase()
        }
    }))
}