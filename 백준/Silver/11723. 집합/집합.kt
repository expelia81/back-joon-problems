import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashSet
import kotlin.collections.Map

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()

    var set = HashSet<Int>()

    fun add(x : Int) {
        set.add(x)
    }

    fun <T> HashSet<T>.check(x : T){
        if (this.contains(x)) bw.write("1")
        else bw.write("0")
        bw.newLine()
    }

    fun <T> HashSet<T>.toggle(x:T) {
        if (this.contains(x)) {
            this.remove(x)
        } else {
            this.add(x)
        }
    }
    fun HashSet<Int>.all() {
        for (i in 1..20) {
            this.add(i)
        }
    }
    fun <T> HashSet<T>.empty() {
        this.clear()
    }

    repeat(n) {
        val st= StringTokenizer(br.readLine(), " ")
        val order = st.nextToken()

        if (order == "all") {
            set.all()
        } else if (order == "empty") {
            set.empty()
        } else {
                val x = st.nextToken().toInt()
                when(order) {
                    "remove" -> set.remove(x)
                    "check" -> set.check(x)
                    "add" -> set.add(x)
                    "toggle" -> set.toggle(x)
                }
            }
        }

    bw.flush()
    br.close()
    bw.close()
}