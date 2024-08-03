
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int gaurd = Integer.parseInt(st.nextToken());
//
//		int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
//		int inputResult = Integer.parseInt(st.nextToken());


		String[] arr = new String[n];
		int result =0;
		int resultb=0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			boolean isContain = false;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'X') {
					isContain = true;
					break;
				}
			}
			if (isContain) {
				arr[i] = s;
			} else {
				result++;
			}
		}

		for (int i = 0; i < gaurd; i++) {
			boolean isContain = false;
			for (int j = 0; j < n; j++) {
				if (arr[j] != null) {
					if (arr[j].charAt(i) == 'X') {
						isContain = true;
						break;
					}
				}
			}
			if (!isContain) {
				resultb++;
			}
		}
		bw.write(Math.max(result,resultb)+"");









		bw.flush();
		br.close();
		bw.close();
	}

}
