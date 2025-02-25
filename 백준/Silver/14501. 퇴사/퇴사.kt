import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt();

    var time = ArrayList<Int>()
    var value = ArrayList<Int>()
    var dp = ArrayList<Int>()

    repeat(21) {
        time.add(0)
        value.add(0)
        dp.add(0)
    }
    var index = 0
    repeat(n) {
        var st = StringTokenizer(br.readLine(), " ")
        time[index] = st.nextToken().toInt()
        var v =st.nextToken().toInt()
        value[index++] = v
//        dp[index] = v
    }

    var result = 0
    for (i in 0 until n+1) {
        var nextTime=i+time[i]
        dp[nextTime] = Math.max(dp[nextTime], dp[i]+value[i])
        dp[i+1] = Math.max(dp[i+1], dp[i])
        result = Math.max(result,dp[i])
    }
    bw.write(result.toString())




    bw.flush()
    br.close()
    bw.close()
}