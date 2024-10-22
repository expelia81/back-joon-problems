
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    repeat(n) {
        var s = br.readLine()
        bw.write("${s.get(0)}${s.get(s.length-1)}\n")
    }

    bw.flush()
    br.close()
    bw.close()
}