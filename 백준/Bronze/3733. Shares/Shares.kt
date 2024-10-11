
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var s = br.readLine()
        if (s==null) {
            break
        }
        var st= StringTokenizer(s, " ")
        var n = st.nextToken().toInt()+1
        var m = st.nextToken().toInt()
        println(m/n)
    }

    bw.flush()
    br.close()
    bw.close()
}
