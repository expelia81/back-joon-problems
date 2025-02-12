import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var st= StringTokenizer(br.readLine(), " ")

    var list = MutableList(n){Person18870(it, st.nextToken().toInt())}

    list.sortWith(Comparator.comparingInt(Person18870::weight));


    var min = 0 - list[0].weight

    list.forEach() {
        it.weight += min
    }

    var pre = 0;
    for (i in 1 until n) {
        if (pre==list[i].weight) {
            list[i].weight = list[i-1].weight
        } else {
            pre = list[i].weight
            list[i].weight = list[i-1].weight+1
        }
    }

    list.sortWith(Comparator.comparingInt(Person18870::order))


    list.forEach() {
        bw.write("${it.weight} ")
    }

    bw.flush()
    br.close()
    bw.close()
}
private class Person18870(val order: Int, var weight: Int) {

    override fun toString(): String {
        return "$order : $weight"
    }
}