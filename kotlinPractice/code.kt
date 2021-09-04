// https://kkh0977.tistory.com/630
// https://youjourney.github.io/archivers/BOJ2752
// https://www.acmicpc.net/problem/2752

import java.util.*;
import java.io.*;

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val token = StringTokenizer(readLine())
    val arr = ArrayList<Int>(3)

    for (i in 0 .. arr.size)
        arr.add(token.nextToken().toInt())

    for (i in 0 .. arr.size)
        println(arr[i].toString())

    bw.flush()
    bw.close()
}