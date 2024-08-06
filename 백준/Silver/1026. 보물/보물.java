
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[n];
		Integer[] arr2 = new Integer[n];
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st2.nextToken());

			arr[i]=a;
			arr2[i]=b;
		}

		int result = 0;
		Arrays.sort(arr);
		Arrays.sort(arr2, Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			result+=arr[i]*arr2[i];
		}
		
		bw.write(result+"\n");

		bw.flush();
		br.close();
		bw.close();
	}

}
