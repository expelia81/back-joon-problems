import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt();

    for(i in 1..n) {
        var st= StringTokenizer(br.readLine(), " ")

        var m = st.nextToken().toInt()
        var k = st.nextToken().toInt()
        bw.write("Case #$i: ${m+k}\n")
    }

    bw.flush()
    br.close()
    bw.close()
}