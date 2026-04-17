package activity.game.input

import activity.clear
import activity.game.SourceCode
import activity.game.mode.Mode

class GameCommandInput(val sourceCode: SourceCode) {

    fun isCommand(input: String): Boolean {
        return when (input) {
            Mode.INSERTCODE.command -> {
                false
            }
            Mode.REVIEWCODE.command -> {
                clear()
                sourceCode.getSourceCode.forEach { codeln ->
                    println(codeln)
                }
                false
            }
            else -> true
        }
    }
}