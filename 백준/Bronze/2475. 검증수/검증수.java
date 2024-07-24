
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long result=0;

		for (int i = 0; i < 5; i++) {
			long n = Long.parseLong(st.nextToken());
			long temp = (long)Math.pow(n,2);
			result+=temp%10;
		}
		System.out.println(result%10);



		bw.flush();
		br.close();
		bw.close();
	}
}
