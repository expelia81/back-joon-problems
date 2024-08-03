
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(br.readLine());

//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//
//		int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
//		int inputResult = Integer.parseInt(st.nextToken());

		//이 별은 무슨색일까

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		int len=0;

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			len = arr[i].length();
		}
		for (int i = 0; i < len; i++) {
			char c = arr[0].charAt(i);
			boolean flag = true;
			for (int j = 1; j < n; j++) {
				if (c!=arr[j].charAt(i)) {
					flag=false;
					break;
				}
			}
			if (flag) {
				bw.write(c);
			} else {
				bw.write("?");
			}
		}








		bw.flush();
		br.close();
		bw.close();
	}

}
