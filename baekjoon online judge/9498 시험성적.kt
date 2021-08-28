import java.util.*;

/* fun main() = with(Scanner(System.`in`)) {
    val score = nextInt()

    when {
        (score > 89) -> println("A")
        (score > 79) -> println("B")
        (score > 69) -> println("C")
        (score > 59) -> println("D")
        else -> println("F")
    }
} */

fun main() = with(Scanner(System.`in`)) {
    val score = nextInt()

    print(
        when{
            score > 89 -> "A"
            score > 79 -> "B"
            score > 69 -> "C"
            score > 59 -> "D"
            else -> "F"
        }
    )
}