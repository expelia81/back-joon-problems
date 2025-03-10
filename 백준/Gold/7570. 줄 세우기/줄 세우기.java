
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		int[] lis = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i]=temp;
		}

		int max = 0;
		for (int i=0; i<n; i++) {
			int temp = arr[i];
			lis[temp] = lis[temp-1]+1;
			max = Math.max(lis[temp],max);
		}

		bw.write(String.valueOf(n-max));


		bw.flush();
		bw.close();
		br.close();
	}
}
/*
5
5 2 4 1 3

6
6 3 2 5 4 1
 */