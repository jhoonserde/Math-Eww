package activity.game.input

import activity.game.SourceCode
import activity.game.mode.Mode

fun insertCode() {

    val sourceCode = SourceCode()

    val gameCommandInput = GameCommandInput(sourceCode)

    while (true) {
        val read: String = readln()
        if (gameCommandInput.isCommand(read)) {
            sourceCode.getSourceCode.add(read)
            sourceCode.setSourceCode(read)
        }
    }
}