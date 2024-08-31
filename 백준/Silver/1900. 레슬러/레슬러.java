
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

		int n = Integer.parseInt(br.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int power = Integer.parseInt(st.nextToken());
			int ring = Integer.parseInt(st.nextToken());

			nodes[i]=new Node(power,ring);
		}
		Arrays.sort(nodes);

		for (int i = 0; i < n; i++) {
			System.out.println(nodes[i].index);
		}







		bw.flush();
		br.close();
		bw.close();
	}

}