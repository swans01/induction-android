fun main() {
    val upperTransformer: (String) -> String = {value: String -> value.toUpperCase()}
     println(hello("Swandy",upperTransformer))

    //trailing lambda
    println(hello("swandy"){value: String -> value.toUpperCase()})
}

fun hello(value: String, transformer: (String) -> String): String{
    return "Hello ${transformer(value)}"
}