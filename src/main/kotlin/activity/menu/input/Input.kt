package activity.menu.input

fun readerInput() {
    do {
        print(">> ")
        val readerInput = MenuCommandInput(readln())
        readerInput.executeCommand()
    } while(true)
}
