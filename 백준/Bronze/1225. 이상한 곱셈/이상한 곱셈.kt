import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine(), " ")
    var n = st.nextToken()
    var k = st.nextToken()
    var result = 0L
    for (c in n.toString().toCharArray()) {
        var i = Integer.parseInt(c.toString())
        for (d in k.toString().toCharArray()) {
            var j = Integer.parseInt(d.toString())
            result += i*j
        }
    }

    bw.write(result.toString())

    bw.flush()
    br.close()
    bw.close()
}