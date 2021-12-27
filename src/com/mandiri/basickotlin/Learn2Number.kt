fun main() {
    //Integer Number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 1000000000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    //Floating Point Number
    var value: Float = 98.99F
    var radius: Double = 2342342343.54535

    println(value)
    println(radius)

    //Literals
    var decimalLiteral: Int = 100
    var hexaDecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b001

    println(decimalLiteral)
    println(hexaDecimalLiteral)
    println(binaryLiteral)

    //underscore in number
    var ageUnderscore: Byte = 3_0

    //conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
    
}