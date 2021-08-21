// https://jjjhong.tistory.com/53

import java.util.*;

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val x = nextInt()

    for(i in 1..n) {
        val temp = nextInt()
        if(temp < x) print("$temp ")
    }
}