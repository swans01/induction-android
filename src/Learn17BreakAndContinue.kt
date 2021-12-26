fun main() {

    //break loop at specific condition
    var i = 0
    while (i < 10){
        println("the loop gonna break at the 5th loop")
        i++
        if (i > 4){
            break
        }
    }

    println("========================")
    //continue
    for (i in 0..5){
        if (i == 2){
            println("this is where variable i not printed and loop continued")
            continue
        }
        println(i)
    }
}