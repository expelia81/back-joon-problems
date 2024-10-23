import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var st = StringTokenizer(br.readLine(), " ")
    var arr = Array(101) {false}
    var result = 0
    repeat(n) {
        var num = st.nextToken().toInt()
        if (arr[num]) {
            result++
        } else {
            arr[num] = true
        }
    }
    bw.write(result.toString())

    bw.flush()
    br.close()
    bw.close()
}