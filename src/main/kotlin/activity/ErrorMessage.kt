package activity

import activity.menu.input.MenuCommandInput

class ErrorMessage(val errorObject: Any) {

    fun errorMessage(): String {
        return when (errorObject) {
            is MenuCommandInput -> "Unknown command: ${errorObject.input}"
            else -> "Program is corrupt, you have reinstall this program"
        }
    }
}