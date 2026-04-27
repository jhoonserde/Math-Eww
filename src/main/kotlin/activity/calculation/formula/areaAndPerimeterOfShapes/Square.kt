package activity.calculation.formula.areaAndPerimeterOfShapes

class Square(val side: Int?) : AreaAndPerimeterOfShapes() {

    fun countArea(): Any {
        return when {
            side != null -> side * side
            else -> "area"
        }
    }

    fun countPerimeter(): Any {
        return when {
            side != null -> 4 * side
            else -> "perimeter"
        }
    }

    fun getFormula(): String {
        return """
            Area = s²
                 = s x s
                 = $side x $side
                 = ${countArea()}
            Perimeter = 4 x s
                      = 4 x $side  
                      = ${countPerimeter()}
        """.trimIndent()
    }
}