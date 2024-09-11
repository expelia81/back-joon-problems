
import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node>{
		int hp;
		int joy;

		@Override
		public int compareTo(Node o) {
			return hp - o.hp;
		}

		public Node(int hp, int joy) {
			this.hp = hp;
			this.joy = joy;
		}
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int index = 1;
		while (n >1 && m>1) {
			if (index%2 ==1) {
				n--;
			} else {
				m--;
			}
			index++;
		}
		bw.write(String.valueOf(index));




		bw.flush();
		br.close();
		bw.close();
	}

	public static class Request implements Comparable<Request>{
		int arrival;
		int burst;
		int complete;
		public Request (int arrival, int burst) {
			this.arrival = arrival;
			this.burst = burst;
			complete = arrival+burst;
		}

		@Override
		public int compareTo(Request o) {
			return 0;
		}
	}
	public static long getComp(int size) {
		return ((long) size * (size-1)) /2;
	}

}