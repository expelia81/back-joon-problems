import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var st= StringTokenizer(br.readLine(), " ")

    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()
    var k = st.nextToken().toInt()
    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()
    var c = st.nextToken().toInt()

    println("${1-n} ${1-m} ${2-k} ${2-a} ${2-b} ${8-c}")

    bw.flush()
    br.close()
    bw.close()
}