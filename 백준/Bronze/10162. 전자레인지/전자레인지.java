
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		int a = 300;
		int b = 60;
		int c = 10;

		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		aCount = n / a;
		n = n % a;
		bCount = n / b;
		n = n % b;
		cCount = n / c;
		n = n % c;
		if (n != 0) {
			bw.write("-1\n");
			bw.flush();
			br.close();
			bw.close();
			return;
		}
		bw.write(aCount + " " + bCount + " " + cCount + "\n");

		bw.flush();
		br.close();
		bw.close();
	}

}
