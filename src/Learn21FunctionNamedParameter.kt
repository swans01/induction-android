fun main() {
    address(city = "Jakarta Selatan", street = "Jl. Karet", province = "DKI Jakarta")
}

fun address(street: String, city: String, province: String){
    println("$street, $city, $province")
}