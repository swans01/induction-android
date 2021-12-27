fun main() {
    fun localFunction(){
        println("This function can't be called from outside function main")
    }

    localFunction()
}

fun test(){
    //can't called from here
    //localFunction()
}

