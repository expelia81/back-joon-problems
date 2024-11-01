import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    var st = StringTokenizer(br.readLine(), " ")
    var n = st.nextToken()
    var m = st.nextToken()

    val bitn = n.toBigInteger(2)
    val bitm = m.toBigInteger(2)

    println((bitn + bitm).toString(2))

}