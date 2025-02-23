import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))


    var n = br.readLine().toInt()

    repeat(n) {
        var st = StringTokenizer(br.readLine())
        var repeator = st.nextToken().toInt()

        var s = st.nextToken()
        var sb = StringBuilder()
        for (i in s) {
            repeat(repeator) {
                sb.append(i)
            }
        }
        bw.write(sb.toString())
        bw.newLine()
    }

    bw.flush()
    br.close()
    bw.close()
}
class LD17837(
    val ArrayList: ArrayList<Int>
)

class CP17837(
    val index:Int,
    val direction:Int
)