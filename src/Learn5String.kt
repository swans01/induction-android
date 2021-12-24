fun main() {
    var firstName: String = "Swandy"
    var lastName: String = "Pakpahan"
    //var fullName: String = "Swandy Pakpahan"
    var address: String = """
        Jl. Jalan No. 01
        Kota City
        Provinsi province
        """

    println(address)

    //String Trim Margin
    var address2: String = """
        |Jl. Jalan No. 01
        |Kota City
        |Provinsi province
        """.trimMargin()

    println(address2)


    //String Template
    var fullName: String = "$firstName $lastName"
    var desc: String = "length of $fullName is ${fullName.length}"

    println(fullName)
    println(desc)

}