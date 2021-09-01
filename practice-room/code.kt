// BufferedReader : https://jjjhong.tistory.com/53
// https://ncucu.me/179?category=903354

import java.util.*;
import java.io.BufferedReader
import java.io.InputStreamReader

// https://hanyeop.tistory.com/178
// https://meoru-tech.tistory.com/57
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = ArrayList<IntArray>()

    for(i in 0 until n) {
        arr.add(readLine().split(" ").map { it.toInt() }.toIntArray())
    }
    
}