import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashSet

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var st= StringTokenizer(br.readLine(), " ")

    var min = st.nextToken().toInt()
    var max = st.nextToken().toInt()

    var set = HashSet<Int>()

    for (i in min..max) {
        set.add(i)
    }
    set.remove(1)

    var array = Array<Int>(max*2){1}
    array.set(1,0)

    fun findPrime() {
        for (i in 2..Math.sqrt(max.toDouble()).toInt()) {
            var n = i;
            while (n <= max) {
                n+=i
                array.set(n,0)
            }
        }
//        for (i in 2..Math.sqrt(max.toDouble()).toInt()) {
//            var n = i;
//            while (n <= max) {
//                n+=i
//                set.remove(n)
//            }
//        }
    }

    findPrime()

//    set.forEach {
//        bw.write(it.toString())
//        bw.newLine()
//    }
    for (i in min..max) {
        if (array.get(i)==1) {
            println(i)
        }
    }

    set.clear()

    bw.flush()
    br.close()
    bw.close()
}