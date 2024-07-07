
import java.io.*;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());

		// bw.write(n.multiply(m).toString());
		// 나눈 값을 먼저 찾아라.
		bw.write(n.divide(m) +"\n");
		// 나머지 값을 찾아라.
		bw.write(n.mod(m).toString());






		bw.flush();
		br.close();
		bw.close();
	}
}
