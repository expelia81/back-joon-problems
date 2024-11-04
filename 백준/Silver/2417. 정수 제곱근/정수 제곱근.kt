import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toLong()

    var start:BigInteger = BigInteger.ZERO
    var end:BigInteger = BigInteger.valueOf(n)

    // 122333444455555
    // 11060446
    var mid: BigInteger

    while (start <= end) {
        mid = (start.add(end).divide(BigInteger.valueOf(2)))
        if (mid.multiply(mid) >= BigInteger.valueOf(n)) {
            end = mid.minus(BigInteger.ONE)
        } else {
            start = mid.plus(BigInteger.ONE)
        }
    }
    println(start)


    bw.flush()
    br.close()
    bw.close()
}