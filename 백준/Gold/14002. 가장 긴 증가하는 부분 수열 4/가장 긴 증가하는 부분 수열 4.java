
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	private static int[] arr;
	private static int[] dp;
	private static int[] graph;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " " );

		arr = new int[n];
		dp = new int[n];;
		graph = new int[n];;

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		int index = 1;

		for (int i = n-1; i >= 0 ; i--) {
			if (max < dp(i)) {
				max = dp[i];
				index = i;
			}
		}

		bw.write(max+"\n");

		Stack<Integer> result = new Stack<>()	;
		while (index!=-1) {
			result.add(arr[index]);
			index = graph[index];
		}

		while (!result.isEmpty()) {
			bw.write(result.pop()+ " ");
		}


		bw.flush();
		bw.close();
		br.close();
	}

	private static int dp(int index) {
		if (dp[index]!=0) {
			return dp[index];
		}

		int target = arr[index];
		int lowIndex = -1;
		int max = 0;
		for (int i = 0; i < index; i++) {
			if (arr[i]<arr[index]) {
				if (max<dp(i)) {
					lowIndex = i;
					max = dp[i];
				}
			}
		}
		graph[index]=lowIndex;
		dp[index]=max+1;

		return dp[index];
	}
}
