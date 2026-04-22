package activity.menu.input

import activity.ErrorMessage
import activity.menu.tui.TuiManager

class MenuCommandInput(val input: String) : TuiManager() {

    val tui = TuiManager()

    fun executeCommand() {
        //check is input blank
        when (input) {

            MenuCommand.OPTIONS.nameMenu -> tui.selectedMenu(1)

            MenuCommand.HELP.nameMenu -> tui.selectedMenu(2)

            MenuCommand.EXIT.nameMenu -> println("Exit")

            else -> {
                tui.selectedMenu(tui.lastIdMenu)
                println(ErrorMessage(this).errorMessage())
            }
        }
    }
}