
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int b = Integer.parseInt(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[a];

			for (int j = 0; j < a; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);

			for (int j = 0; j < b; j++) {
				int target = Integer.parseInt(st2.nextToken());
				int start = 0;
				int end = a-1;
				int mid=999;
				while (start < end) {
					mid = start + (end - start)/2;
//					System.out.printf("%d, arr[%d] %d\n", target, mid, arr[mid]);
					if (arr[mid] > target) {
						end = mid-1;
					} else if (arr[mid] < target) {
						start = mid+1;
					} else {
						break;
					}
				}
				mid = start + (end - start)/2;
				bw.write(arr[mid]==target ? "1":"0");
				bw.newLine();
//				System.out.printf("finded : %d, %d %d\n", target, mid, arr[mid]);
			}


		}


		bw.flush();
		bw.close();
		br.close();
	}
}
