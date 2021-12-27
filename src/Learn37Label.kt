fun main() {
    loopI@ for(i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i x $j = ${i * j}")
            if (j == 5){
                //break@loopI
                continue@loopI
            }
        }
    }

    fun test (name: String, param: (String) -> Unit): Unit = param(name)

    test("") testLabel@{
        if(it == "swandy"){
            return@testLabel
        }else{
            println("tadddaa")
        }
    }
}