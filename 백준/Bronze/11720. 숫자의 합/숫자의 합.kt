import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt();

//    var t = Math.pow(15.0,15.0).toLong()

    var num = br.readLine()
    var sum = 0
    for (i in 1..n) {
        var number = num[i-1].toString().toInt()
        sum += number
    }
    
    bw.write(sum.toString() + "\n")
    

    bw.flush()
    br.close()
    bw.close()
}