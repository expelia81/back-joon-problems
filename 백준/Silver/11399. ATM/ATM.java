
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int value = 0;
		int result=0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			list.add(a);
		}
		Collections.sort(list);
		for (int i = 0; i < n; i++) {
			int a = list.get(i);
			value+=a;
			result+=value;
		}
		bw.write(result+"\n");


		bw.flush();
		br.close();
		bw.close();
	}

}
