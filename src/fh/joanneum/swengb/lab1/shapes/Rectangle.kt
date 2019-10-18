package fh.joanneum.swengb.lab1.shapes

import fh.joanneum.swengb.lab1.Shape

class Rectangle(color:String = "black", val width:Double = 1.0, val length:Double = 1.0): Shape(color) {
    override fun getArea(): Double {
        return width * length
    }

    override fun toString(): String {
        return "Rectangle(width=$width, length=$length, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rectangle

        if (width != other.width) return false
        if (length != other.length) return false

        return true
    }

    override fun hashCode(): Int {
        var result = width.hashCode()
        result = 31 * result + length.hashCode()
        return result
    }


}