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

    var list = ArrayList<Long>(110)
    list.add(0)
    list.add(1)
    list.add(1)
    list.add(1)
    list.add(2)
    list.add(2)

    for (i in 6..101) {
        list.add(list[i-1]+list[i-5])
    }

    repeat(n) {
        bw.write("${list[br.readLine().toInt()]}\n")
    }


    bw.flush()
    br.close()
    bw.close()
}

