fun main() {

    val range = 0..10

    //range terbalik
    val rangeTerbalik = 10 downTo  0

    //range with step
    val rangeWithStep = 1..100 step 5

    println(range.count())
    println(rangeTerbalik.contains(5))
    println(range.first)
    println(rangeTerbalik.last)
    println(rangeWithStep.step)
}