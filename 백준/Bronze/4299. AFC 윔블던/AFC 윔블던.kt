
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    var st = StringTokenizer(br.readLine(), " ")
    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    // a+b
    // a-b
    // 2a
    //

    if ((n+m)%2==1 || m>n) {
        println("-1")
        return
    }

    var high = (n+m)/2;
    var low = high-m;


    println("$high $low")

}