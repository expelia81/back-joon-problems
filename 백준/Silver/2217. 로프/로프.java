
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());


		int[] arr = new int[n+1];

		for (int i = 1; i <1+ n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int result = 0;
		for (int i = 1; i <= n; i++) {
			int size = n-i+1;
			result = Math.max(result, size * arr[i]);
		}


		bw.write(result + "\n");


		bw.flush();
		br.close();
		bw.close();
	}

}
