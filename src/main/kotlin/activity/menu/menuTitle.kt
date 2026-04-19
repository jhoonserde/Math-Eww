package activity.menu

import activity.clear
import activity.graphics.mathEwwAscii
import activity.menu.input.MenuCommandInput

fun menuTitle() {
    val menuTitle = """
    !$mathEwwAscii
    !Main menu Command:
    !options  ||  o     - to view the option menus
    !help     ||  h     - for help and guidance
    !exit     ||  x     - to quit this program
    !
    !   
    """.trimMargin("!")

    clear()
    println(menuTitle)
    do {
        print(">> ")
        val reader = MenuCommandInput(readln())
        reader.executeCommand()
    } while(reader.isError)
}