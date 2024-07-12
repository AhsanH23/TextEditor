package nicknamecreator.nicknamegenerator.nickname_maker.texteditor


class TextToEmojiConverter {
    fun drawTTE(text: String, emoji: String): String {
        val mappings = mapOf(
            0 to emoji,
            1 to "    ",
            2 to "     ",
            3 to "      ",
            4 to "       ",
            5 to "        ",
            6 to "         ",
            7 to "           ",
            8 to "            ",
            11 to "   ",
            12 to " "
        )
        val input = text.trim()
        var alpha = PatternData().alphabetArrCap
        val result = StringBuilder()
        for (line in alpha) {
            for (x in line) {
                for (y in x) {
                    result.append(mappings[y] ?: "")
                }
                result.append("\n")
            }
            result.append("\n\n")
        }
        return result.toString()
    }


}