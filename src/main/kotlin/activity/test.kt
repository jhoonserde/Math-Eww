package activity

import activity.calculation.formula.areaAndPerimeterOfShapes.Square

fun test() {
    val square = Square(side = 123)
//    println(square.countArea)
//    println(square.countPerimeter)
    println(square.getFormula())
}