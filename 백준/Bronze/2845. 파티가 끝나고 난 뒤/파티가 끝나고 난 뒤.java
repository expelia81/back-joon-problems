
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int man = x*y;
		st = new StringTokenizer(br.readLine(), " ");
		List<Integer> list = new ArrayList<>();
		while (st.hasMoreTokens()){
			list.add(Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)-man);
		}

		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i)+" ");
		}



		bw.flush();
		br.close();
		bw.close();
	}

}
