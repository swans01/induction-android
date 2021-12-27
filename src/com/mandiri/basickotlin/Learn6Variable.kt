//variable constant
const val TITLE = "Basic Kotlin"

fun main() {
    //variable mutable
    var vehicle: String = "Car"
    var brand: String = "Toyota"

    // mutable dapat mengubah isi
    brand = "Daihatsu"

    //variable immutable
    val merk: String = "Lenovo"

    // error, variable tidak bisa di reassigned lagi
    //merk = "HP"


    //nullable
    var canBeNull: String? = "notNull"
    canBeNull = null

    println(canBeNull?.length)

    //print variable constant
    println(TITLE)

}