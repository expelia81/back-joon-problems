
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());


		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] meters = new int[n-1];
		int[] prices = new int[n-1];

		for (int i = 0; i < n-1; i++) {
			meters[i]=Integer.parseInt(st.nextToken());
			prices[i]=Integer.parseInt(st2.nextToken());
		}

		long nowPrice = prices[0];
		long meter = meters[0];

		long result = 0;
		for (int i = 1; i < n-1; i++) {
			if (prices[i]<nowPrice) {
				result += meter*nowPrice;
				nowPrice = prices[i];
				meter = 0;
			}
			meter += meters[i];
		}

		result += meter*nowPrice;
		System.out.println(result);






		bw.flush();
		br.close();
		bw.close();
	}

}