fun main() {
    val arrayString: Array<String> = arrayOf("Satu", "Dua", "Tiga")
    val arrayInt: Array<Int> = arrayOf(1, 2, 3)

    println(arrayString.get(0))
    arrayString.set(0, "Nol")
    println(arrayString.get(0))

    //Array nullable
    val arrayNullable: Array<String?> = arrayOfNulls(3)
    arrayNullable.set(0,"Satu")
    arrayNullable.set(1,null)
    arrayNullable.set(2,"Dua")

    println(arrayNullable.get(1))

}