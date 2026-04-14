package activity.game.input

import activity.clear
import activity.game.SourceCode

class GameCommandInput(val sourceCode: SourceCode) {

    fun isCommand(input: String): Boolean {
        when (input) {
            GameCommand.REVIEWC.command -> {
                clear()
                sourceCode.getSourceCode.forEach { codeln ->
                    println(codeln)
                }
                return false
            }
            else -> return true
        }
    }
}