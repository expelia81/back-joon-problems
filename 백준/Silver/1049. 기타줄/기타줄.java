
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int six = n/6;
		int one = n%6;
		int result = 0;


		int minSix = Integer.MAX_VALUE;
		int minOne = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			minSix = Math.min(minSix, a);
			minOne = Math.min(minOne, b);
		}

		if (minSix < minOne*6 && minSix < minOne*(one)) {
			result = minSix*(six+1);
		} else if (minSix < minOne*6) {
			result = minSix*six + minOne*(one);
		} else {
			result = minOne*n;
		}

		bw.write(result+"\n");

		bw.flush();
		br.close();
		bw.close();
	}

}
