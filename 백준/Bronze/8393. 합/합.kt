
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var result = 0

    for (i in 1..n) {
        result += i
    }
    println(result)

    bw.flush()
    br.close()
    bw.close()
}
