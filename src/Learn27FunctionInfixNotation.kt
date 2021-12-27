fun main() {
    println("swandy" to "UP")
}

infix fun String.to(type: String): String{
    if (type == "UP"){
        return  this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

