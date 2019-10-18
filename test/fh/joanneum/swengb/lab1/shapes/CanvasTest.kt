package fh.joanneum.swengb.lab1.shapes

import org.junit.Test

import org.junit.Assert.*

class CanvasTest {

    @Test
    fun testGetTotalArea() {
        val canvas = Canvas()
        canvas.addShape(Rectangle("white",5.0,2.0))
        canvas.addShape(Circle("red",1.0))

        assertEquals(13.142,canvas.getTotalArea(),0.001)
    }

    @Test
    fun testGetTotalAreaForZeroElements() {
        val canvas = Canvas()
        assertEquals(0.0,canvas.getTotalArea(),0.001)
    }

    @Test
    fun shouldCountTwoRectanglesAndOneCircle() {
        val canvas = Canvas()
        canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
        canvas.addShape(Circle("red", radius = 1.0))
        canvas.addShape(Rectangle("blue", width = 4.5, length = 4.0))

        val countedShapes = canvas.shapesCntPerType()
        assertEquals(2, countedShapes["Rectangle"])
        assertEquals(1, countedShapes["Circle"])
    }
}