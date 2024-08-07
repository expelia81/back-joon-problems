
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int[][] dp;

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		String start = st.nextToken();
//		String end = st.nextToken();
//
//
//		while (start.length() < end.length()) {
//			start = "0" + start;
//		}
//		int[] endArr = new int[end.length()];
		dp = new int[n][3];

		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;

		for (int i = 1; i < n; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
		}

		int result = (dp[n - 1][0] + dp[n - 1][1] + dp[n - 1][2]) % 9901;

		bw.write(result + "\n");


		bw.flush();
		br.close();
		bw.close();
	}

}
