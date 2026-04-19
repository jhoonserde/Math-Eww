package activity.menu

import activity.clear
import activity.graphics.mathEwwAscii
import activity.menu.input.MenuCommandInput

fun helpTitle() {
    val titleHelpMenu = """
    !$mathEwwAscii
    !Help menu Command:
    !   
    !   
    """.trimMargin("!")
    clear()
    println(titleHelpMenu)
    do {
        print(">> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while (reader.isError)
}