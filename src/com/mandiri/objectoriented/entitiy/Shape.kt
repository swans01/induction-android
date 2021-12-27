package com.mandiri.objectoriented.entitiy

open class Shape{
    open val corner: Int = 1
}

class Rectangle: Shape(){
    override val corner: Int = 4
}

class Triangle: Shape(){
    override val corner: Int = 3
    val parentCorner: Int = super.corner
}
