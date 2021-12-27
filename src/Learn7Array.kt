fun main() {
    //array is immutable
    val arrayString: Array<String> = arrayOf("Satu", "Dua", "Tiga")
    var arrayInt: Array<Int> = arrayOf(1, 2, 3)

    //immutable list
    val list = listOf<Int>(1,2,4)

    //mutable list
    val list2 = mutableListOf<Int>(1,2,3)
    list2.add(4)
    println(list2.size)

    //set
    val set = setOf<Int>(2,3,2)
    println(set)

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