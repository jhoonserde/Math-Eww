package activity.game.mode

enum class Mode(
    val command: String,
    val title: String,
) {

    INSERTCODE(
        command = "/insertc",
        title = "/// Mode : Insert code",
    ),

    REVIEWCODE(
        command = "/reviewc",
        title = "/// Mode : Review code",
    ),

    ENDGAME(
        command = "/ngame",
        title = "quit game",
    )

}