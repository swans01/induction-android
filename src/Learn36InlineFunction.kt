fun main() {
    println(helloInline { "Swandy" })
}

inline fun helloInline (name: () -> String ): String{
    return "Hello ${name()}"
}