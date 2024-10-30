import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))

    var result = 0
    repeat(5) {
        result += br.readLine().toInt()
    }
    println(result)
    br.close()
}