package activity.menu

import activity.clear
import activity.graphics.mathEwwAscii
import activity.menu.input.MenuCommandInput

fun optionsTitle() {
    val titleOptions = """
    !$mathEwwAscii
    !Options menu Command:
    !
    !   
    """.trimMargin("!")
    clear()
    println(titleOptions)
    do {
        print(">> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while (reader.isError)
}