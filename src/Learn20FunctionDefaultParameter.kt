fun main() {
    helloUser()
    helloUser("Swandy", "Pakpahan")
}

fun helloUser(firstName: String = "user", lastName: String = ""){
    println("Hello $firstName $lastName")
}