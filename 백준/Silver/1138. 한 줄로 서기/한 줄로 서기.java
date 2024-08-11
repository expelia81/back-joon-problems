
import java.io.*;
import java.util.*;

public class Main {

	static class Node implements Comparable<Node>{
		int value;
		int numbers;

		public Node(int value, int numbers) {
			this.value = value;
			this.numbers = numbers;
		}

		@Override
		public String toString() {
			return "Node{" +
							"value=" + value +
							", turn=" + numbers +
							'}';
		}

		@Override
		public int compareTo(Node o) {
			return numbers-o.numbers	;
		}
	}

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Node[] arr = new Node[n+1];

		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (int i = 1; i <= n; i++) {
			arr[i]=new Node(i,Integer.parseInt(st.nextToken()));
//			pq.add(arr[i]);
		}

		int[] result = new int[n+1];

		for (int i = 1; i < n+1; i++) {
			Node node = arr[i];
			int val = node.numbers+1;
			// val은 index 1에서부터 이동해야하는 횟수이다.
			// 만약에, 0이어도 1칸 움직인다는 개념이다.
			int index=0;
			int realIndex=0;
			while (index<val) {
				index++;
				realIndex++;

				while (result[realIndex]!=0) {
					realIndex++;
				}
				if (index==val) {
					result[realIndex]=node.value;
				}
//				for (int j = 1; j < n+1; j++) {
//					System.out.print(result[j]+" ");
//				}
//				System.out.println();
			}
		}

		for (int i = 1; i < n+1; i++) {
			bw.write(result[i]+" ");
		}



		bw.flush();
		br.close();
		bw.close();
	}

}
