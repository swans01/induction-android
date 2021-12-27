fun main() {
    val lambdaName: (String) -> String = {
        value: String -> value.toUpperCase()
    }

    val lambdaNameIt: (String) -> String = {
        it.toUpperCase()
    }

    val lamdaNameReference: (String) -> String = ::toUpper

    println(lambdaName("swandy"))
    println(lambdaNameIt("swandy"))
    println(lamdaNameReference("swandy"))
}

fun toUpper(value : String) : String = value.toUpperCase()