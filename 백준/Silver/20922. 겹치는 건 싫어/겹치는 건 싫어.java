
import java.io.*;
import java.util.*;

public class Main {

	static int max;
	static int n;
	static int[] arr;
	static int[] count;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 n = Integer.parseInt(st.nextToken());
		 max= Integer.parseInt(st.nextToken());

		 st = new StringTokenizer(br.readLine(), " ");

		 arr = new int[n];
			count = new int[100001];
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		int start = 0;
		int end =0;
		count[arr[0]]++;
		int result = 1;
		while (start<n) {
//			System.out.println(start + " / " +end);
			int nextEnd = end+1;
			if (nextEnd<n){
				if (count[arr[nextEnd]] == max) {
					while (true) {
						count[arr[start]]--;
						start++;
						if (count[arr[nextEnd]] != max) {
							break;
						}
					}
				}
				end++;
				count[arr[end]]++;
				result = Math.max(result, end-start+1);
			} else {
				break;
			}
		}

		System.out.println(result);

	}

}
