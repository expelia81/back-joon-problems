
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
//
		int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int inputResult = Integer.parseInt(st.nextToken());

		if (result==inputResult) {
			bw.write("correct!");
		} else {
			bw.write("wrong!");
		}



		bw.flush();
		br.close();
		bw.close();
	}
}
