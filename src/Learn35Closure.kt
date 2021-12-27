fun main() {
    var counter: Int = 0
    val increment: () -> Unit = {
        //accessing variable within a local scope
        counter++
        println("counter = $counter")
    }

    increment()
    increment()
}