
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> list = new ArrayList<>();
		while (st.hasMoreTokens()){
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list.sort((o1, o2) -> o1-o2);
		
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i)+" ");
		}
		


		bw.flush();
		br.close();
		bw.close();
	}

}
