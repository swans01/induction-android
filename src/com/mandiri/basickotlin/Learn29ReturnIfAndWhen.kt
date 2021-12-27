fun main() {
    println(helloBro())
    println(helloBro2("Swandy"))
}

//return if
fun helloBro(name: String = ""): String{
    return if (name == ""){
        "Hello Bro"
    }else{
        "Hello $name"
    }
}

//return when
fun helloBro2(name: String = ""): String{
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}