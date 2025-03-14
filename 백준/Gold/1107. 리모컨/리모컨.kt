import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var m = br.readLine().toInt()

    var set = HashSet<Char>()
    if (m>0) {
        var st= StringTokenizer(br.readLine(), " ")
        repeat (m) {
            set.add(st.nextToken().get(0))
        }
    }

    var now = 0

    fun check(a : Int) : Boolean {
        var temp = a.toString()
        for (i in temp.indices) {
            if (set.contains(temp[i])) {
                return false
            }
        }
        return true
    }

    var result: Int
    if (n < 100) {
        result = 100-n
    } else {
        result = n-100
    }
    if (check(n)) {
        result = Math.min(result,n.toString().length)
    }

    while (now < result) {
        var high = n+now
        var low = n-now
        var hv = Int.MAX_VALUE
        var lv = Int.MAX_VALUE
        if (check(high)) {
            hv = high.toString().length
        }
        if (check(low)) {
            lv = low.toString().length
        }

        if (hv < 1000000 || lv < 1000000) {
            result = Math.min(result,(Math.min(hv,lv)+now))
//            println(result)
//            println("${now} : ${result}")
            break
        }
        now++

    }
    bw.write(result.toString())
    bw.flush()
    br.close()
    bw.close()
}