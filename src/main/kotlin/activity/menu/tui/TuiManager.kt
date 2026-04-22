package activity.menu.tui

import activity.graphics.mathEwwAscii
import activity.graphics.menuTitle
import activity.graphics.titleHelpMenu
import activity.graphics.titleOptions
import kotlin.properties.Delegates

open class TuiManager {

    init {

        clearScreen()

        println(mathEwwAscii)
    }

    var lastIdMenu: Int = 0

    fun selectedMenu(idMenu: Int) {
        when (idMenu) {
            0 -> println(menuTitle)
            1 -> println(titleOptions)
            2 -> println(titleHelpMenu)
        }
        lastIdMenu = idMenu
    }

    fun clearScreen() {

        print("\u001b[H\u001b[2J")

        System.out.flush()
    }

}