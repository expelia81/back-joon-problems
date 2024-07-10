
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[i]=temp;
		}
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}



		bw.flush();
		br.close();
		bw.close();
	}

}
