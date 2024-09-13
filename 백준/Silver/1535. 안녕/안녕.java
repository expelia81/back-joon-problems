
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

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

		int[] hp = new int[n];
		int[] joy = new int[n];
		int[][] dp = new int[n][101];
		Node[] nodes = new Node[n];

		for (int i = 0; i < n; i++) {
			hp[i] = Integer.parseInt(st.nextToken());
			joy[i] = Integer.parseInt(st2.nextToken());
			nodes[i] = new Node(hp[i],joy[i]);
		}
		Arrays.sort(nodes);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 101; j++) {
				if(i > 0) {
					if(j>nodes[i].hp) {
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nodes[i].hp] + nodes[i].joy);
					} else {
						dp[i][j]=dp[i-1][j];
					}
				} else {
					if (j>nodes[i].hp) {
						dp[i][j] = nodes[i].joy;
					}
				}
			}
		}

		bw.write(String.valueOf(dp[n-1][100]));




		bw.flush();
		br.close();
		bw.close();
	}


}