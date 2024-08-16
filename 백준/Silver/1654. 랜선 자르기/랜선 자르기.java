
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
		 long max = 0;

		 long[] arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]+1);
		}


		while (start < max) {
//			System.out.println(start + " / " +max);

			long mid = (start+max)/2;

			long count = count(arr,mid);

//			if (count==target) {
//				result = Math.max(mid,result);
//			}

			if (count>=target) {
				// 마지막은 항상 이곳으로 오는데,
				// 이 마지막 start 값이 찾으려는 값의 +1이다.
				start = mid+1;
			} else {
				max = mid;
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
