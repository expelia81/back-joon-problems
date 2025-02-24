import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()

    var time = System.currentTimeMillis()

    var primes = sieveOfEratosthenes(123456*2)

    var time2 = System.currentTimeMillis()

    while (n != 0) {
        var count = 0
        for (i in 0 until primes.size) {
            if (primes[i] > n && primes[i] <= 2*n) {
                count++
            }
        }
        bw.write(count.toString())
        bw.newLine()
        n = br.readLine().toInt()
    }




    bw.flush()
    br.close()
    bw.close()
}
fun sieveOfEratosthenes(n: Int): List<Int> {
    // 2부터 n까지의 모든 정수를 포함하는 배열 생성
    val isPrime = BooleanArray(n + 1) { true }

    // 0과 1은 소수가 아님
    isPrime[0] = false
    isPrime[1] = false

    // 에라토스테네스의 체 알고리즘 구현
    for (i in 2..kotlin.math.sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            // i의 배수들을 모두 false로 표시
            for (j in (i * i)..n step i) {
                isPrime[j] = false
            }
        }
    }

    // 소수만 리스트에 추가
    return isPrime.withIndex()
        .filter { it.value }
        .map { it.index }
}