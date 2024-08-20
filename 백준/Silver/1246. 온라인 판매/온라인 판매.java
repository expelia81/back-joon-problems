
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		/* 여러 정수 쓰는 경우 */
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		/* 배열 필요한 경우 */
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int result = 0;
		int index = -1;
		for (int i = 0; i < n; i++) {
			int temp = Math.min(n-i,m) * arr[i];
			if (temp > result) {
				result = temp;
				index = arr[i];
			}
		}
		bw.write(index + " " +result);



		bw.flush();
		br.close();
		bw.close();
	}

}