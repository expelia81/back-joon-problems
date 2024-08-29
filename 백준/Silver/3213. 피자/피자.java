
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int quarter = 0;
		int half = 0;
		int notQuarter = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.equals("1/2")) {
				half++;
			}
			if (s.equals("3/4")) {
					notQuarter++;
			}
			if (s.equals("1/4")) {
					quarter++;
			}
		}

		result+=notQuarter;

		quarter-=Math.min(quarter,notQuarter);

		half+=quarter/2;
		quarter = quarter%2;

		result+=half/2;
		half=half%2;

		if (quarter == 0 && half==0) {
			System.out.println(result);
		} else {
			System.out.println(result+1);
		}








		bw.flush();
		br.close();
		bw.close();
	}

}