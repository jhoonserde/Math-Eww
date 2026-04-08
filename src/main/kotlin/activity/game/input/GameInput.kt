package activity.game.input

import activity.game.SourceCode

fun insertCode(

) {
    val sourceCode = SourceCode()
    val gameCommandInput = GameCommandInput(sourceCode)
    while (sourceCode.getSourceCode.last() != "/endr") {
        val read: String = readln()
        if (gameCommandInput.isCommand(read)) {
            sourceCode.getSourceCode.add(read)
            sourceCode.getSourceCode.add(read)
        }
    }
}