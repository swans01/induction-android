fun main() {
    println(factorialRecursive(17))
}

fun factorialRecursive(value: Int): Int{
    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}