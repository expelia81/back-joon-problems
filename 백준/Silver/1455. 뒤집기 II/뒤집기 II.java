
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[][] arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) == '0';
			}
		}

		int result = 0;
		for (int j = m-1; j >=0 ; j--) {
			for (int i = n-1; i >= 0; i--) {
//				log(arr);
				if (!arr[i][j]) {
					set(i, j, arr);
					result++;
				}
			}
		}
		System.out.println(result);
	}

	private static void log(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] ? "1" : "0");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void set(int n, int m, boolean[][] arr) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				arr[i][j] = !arr[i][j];
			}
		}

	}
}
