const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}

/*

Output with trimIndent
#question = "life, the universe, and everything"
#answer = 42
Output with trimMargin("#")
question = "life, the universe, and everything"
answer = 42
 */