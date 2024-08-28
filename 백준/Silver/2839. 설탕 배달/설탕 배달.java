
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
		int three = 0;

		while (n > 0) {
			if (n%3==0) {
				three+=n/3;
				n=0;
			} else if (five==0 && three==0) {
				System.out.println(-1);
				return;
			} else if(five > 0) {
				five--;
				n+=5;
			}

		}
		System.out.println(five+three);





		bw.flush();
		br.close();
		bw.close();
	}

}