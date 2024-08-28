
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		int[][] arr;

		Comparator<int[]> comp = (o1,o2) -> o1[0]-o2[0];
		Comparator<int[]> comp2 = comp.thenComparing(((o1, o2) -> o1[1]-o2[1]));

		for (int turn = 0; turn < test; turn++) {
			int n = Integer.parseInt(br.readLine());
			arr = new int[n][2];
			for (int i = 0; i < n; i++) {
				String[] s = br.readLine().split(" ");
				arr[i][0] = Integer.parseInt(s[0]);
				arr[i][1] = Integer.parseInt(s[1]);
			}
			Arrays.sort(arr,comp2);

			int result = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (arr[i][1] < min) {
					min = arr[i][1];
					result ++;
				}
			}
			System.out.println(result);
		}





		bw.flush();
		br.close();
		bw.close();
	}

}