package fh.joanneum.swengb.lab1.shapes

import fh.joanneum.swengb.lab1.Shape

class Canvas() {
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    fun getTotalArea(): Double {
        return (shapes.map { it.getArea() }.sum())
    }
/*
    fun shapesCntPerType(): Map<String, Int> {
        var foo = 0
        var bar = 0
        for (i in shapes) {
            if (i is Circle) {
                foo += 1
            } else {
                bar += 1
            }
        }
        return mapOf("Circle" to foo,"Rectangle" to bar)
    }
    */

    fun shapesCntPerType(): Map<String,Int> {
        return (shapes.groupBy() { it.javaClass.simpleName }).map { it -> it.key to it.value.size }.toMap()

    }
}