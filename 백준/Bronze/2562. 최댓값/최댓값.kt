import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    var index = -1

    for(i in 1..9) {
        var n = br.readLine().toInt();
        if (max < n) {
            max = n
            index = i
        }
    }

    bw.write("$max\n$index")
    bw.flush()
    br.close()
    bw.close()
}