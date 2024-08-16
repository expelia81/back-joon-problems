
import java.io.*;
import java.util.*;

public class Main {

	static int target;
	static int n;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 n = Integer.parseInt(st.nextToken());
		 target = Integer.parseInt(st.nextToken());

		 long start = 0;
		 long end=Integer.MAX_VALUE;

		 long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i]=Long.parseLong(br.readLine());
		}

		while (start<end) {
			long mid = (start+end)/2;

			long count = count(arr, mid);

			if (count>=target) {
				start = mid+1;
			} else {
				end = mid;
			}
		}
		System.out.println(start-1);



	}

	static long count(long[] arr, long size) {
		long result = 0;
		for (int i = 0; i < n; i++) {
			result+=arr[i]/size;
		}
		return result;
	}
}
