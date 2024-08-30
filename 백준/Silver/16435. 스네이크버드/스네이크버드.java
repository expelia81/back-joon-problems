
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());

		int size = Integer.parseInt(st.nextToken());


		st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			if (arr[i] <= size) {
				size++;
			} else {
				break;
			}
		}
		System.out.println(size);







		bw.flush();
		br.close();
		bw.close();
	}

}