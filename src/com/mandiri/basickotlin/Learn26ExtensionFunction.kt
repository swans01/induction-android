fun main() {
    val name: String = "Swandy"
    println(name.hello())
}

fun String.hello(): String{
    return "Hello $this"
}