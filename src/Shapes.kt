import fh.joanneum.swengb.lab1.shapes.Canvas
import fh.joanneum.swengb.lab1.shapes.Circle
import fh.joanneum.swengb.lab1.shapes.Rectangle
import java.util.*
import kotlin.collections.MutableList

fun allElemsSame(list: List<Int>): Boolean {
    val start = list[0]
    for (i in list) {
        if (i != start) {
            return false
        }
    }
    return true
}

fun quick(unsorted:List<Int>): List<Int> {
    if (unsorted.size <= 1)
        {return unsorted}
    val pivot = unsorted[0]
    if (allElemsSame(unsorted))
        {return unsorted}
    var left = unsorted.filter { it < pivot }
    var right = unsorted.filter { it >= pivot }
    unsorted = null
    return quick(left).plus(quick(right))
}

fun main() {
    val list = listOf<Int>(7,8,4,3,4,5,3,1,5,6,5,4,8,6,4,8,9)
    val sorted = quick(list)
    for (i in sorted) {
        println(i.toString())
    }

}