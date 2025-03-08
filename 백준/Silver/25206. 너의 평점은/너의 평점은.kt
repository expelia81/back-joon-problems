import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))


    val str = arrayOfNulls<String>(20)
    var totalSum = 0.0
    var scoreSum = 0.0
    val gradeList = arrayOf("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P")
    val gradeScore = doubleArrayOf(4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0)

    for (i in 0..19) {
        str[i] = br.readLine()
        val st = StringTokenizer(str[i], " ")
        val subject = st.nextToken()
        val score = st.nextToken().toDouble()
        val grade = st.nextToken()

        for (j in 0..9) {
            if (grade == gradeList[j]) {
                totalSum += score * gradeScore[j]
                if (j != 9) {
                    scoreSum += score
                }
            }
        }
    }

    val average = totalSum / scoreSum
    bw.write("$average")

//    var st = StringTokenizer(br.readLine(), " ")
//    var n = st.nextToken()
//    var k = st.nextToken()
//    var result = 0L
//    for (c in n.toString().toCharArray()) {
//        var i = Integer.parseInt(c.toString())
//        for (d in k.toString().toCharArray()) {
//            var j = Integer.parseInt(d.toString())
//            result += i*j
//        }
//    }
//
//    bw.write(result.toString())

    bw.flush()
    br.close()
    bw.close()
}