
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int power;
		int ring;
		int index;

		public Node(int power, int ring) {
			this.power = power;
			this.ring = ring;
			this.index=++indexValue;
		}

		@Override
		public int compareTo(Node o) {
			return -(power+o.power*ring) + (o.power + o.ring*power);
		}
	}
	static int indexValue=0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int result = 1;
		if (n>2 && m>6) {
			result += (m-3);
		} else if (n==1 || m==1) {
		} else if (n<3) {
			result += (m-1)/2;
			result = Math.min(result, 4);
		} else {
			result += m-1;
			result = Math.min(result,4);
		}

		System.out.println(result);


		bw.flush();
		br.close();
		bw.close();
	}

}