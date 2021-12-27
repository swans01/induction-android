fun main() {
    total(1,2,3,4)
}

fun total(vararg numbers:  Int){
    var total = 0
    for (number in numbers){
        total += number
    }
    println(total)
}