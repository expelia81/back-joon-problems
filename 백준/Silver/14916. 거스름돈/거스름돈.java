
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int five = n/5;
		n = n%5;
		int two = 0;

		while (n > 0) {
			if (n%2==0) {
				two+=n/2;
				n=0;
			} else if (five>0) {
				n+=5;
				five--;
			} else {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(five+two);






		bw.flush();
		br.close();
		bw.close();
	}

}