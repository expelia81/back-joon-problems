import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var s = br.readLine()

    var array = Array<Int>(s.length){0}

    for (i in 0 until s.length) {
        array[i] = s[i].toString().toInt()
    }

    array.sort()

    for (i in array.size-1 downTo 0) {
        bw.write("${array[i]}")
    }


    bw.flush()
    br.close()
    bw.close()
}