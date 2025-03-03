import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		int[][] arr = new int[101][101];

		int sum = 0;

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			for (int j = n; j < n+10; j++) {
				for (int k = m; k < m+10; k++) {
					if (arr[j][k] == 0) {
						sum++;
					}
					arr[j][k] = 1;
				}
			}
		}

		bw.write(sum + "\n");





		bw.flush();
		bw.close();
		br.close();
	}
}
