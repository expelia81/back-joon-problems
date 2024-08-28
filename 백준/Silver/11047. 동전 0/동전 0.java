
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());

		Integer[] tokens = new Integer[n];
		for (int i = 0; i < n; i++) {
			tokens[i] = Integer.parseInt(br.readLine());
		}

		int result = 0;
		Arrays.sort(tokens, Comparator.reverseOrder());
		for (int i = 0; i < n; i++) {
			while (value/tokens[i] > 0) {
				result += value/tokens[i];
				value= value%tokens[i];
			}
		}
		System.out.println(result);

		/*
예상으로는 안될 반례임.
4 84
1
5
39
80
-> 3 나와야함
		 */







		bw.flush();
		br.close();
		bw.close();
	}

}