import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var st= StringTokenizer(br.readLine(), " ")

    var n = st.nextToken().toLong()
    var m = st.nextToken().toLong()
    var k = st.nextToken().toLong()

    var result = 0L

    if ( m >= k) {
        println(-1)
        return
    } else {
        result = n / (k-m) +1
    }
    println(result)


    bw.flush()
    br.close()
    bw.close()
}