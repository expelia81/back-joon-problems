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

    var now = 0L
    var day = 0L
//
//    while (now < k) {
//        now+=n
//        day++
//        if (now >= k) {
//            break
//        } else {
//            now-=m
//        }
//    }

    var result = if ((k-n)%(n-m)==0L) {
        (k-n)/(n-m)+1
    } else {
        (k-n)/(n-m)+2
    }

    bw.write(result.toString())





    bw.flush()
    br.close()
    bw.close()
}