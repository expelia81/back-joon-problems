
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n==0) {
			System.out.println("0");
			return;
		}

		st = new StringTokenizer(br.readLine(), " ");
		int result = 1;
		int size = 0;

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (size + value > m) {
				result++;
				size = value;
			} else {
				size += value;
			}
		}

		System.out.println(result);





		bw.flush();
		br.close();
		bw.close();
	}

}