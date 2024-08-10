
import java.io.*;
import java.util.*;

public class Main {

	static class Node{
		long value;
		int turn;

		public Node(long value, int turn) {
			this.value = value;
			this.turn = turn;
		}

		@Override
		public String toString() {
			return "Node{" +
							"value=" + value +
							", turn=" + turn +
							'}';
		}
	}

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Queue<Node> queue = new LinkedList<>();

		Node start = new Node(Integer.parseInt(st.nextToken()),1);
		queue.add(start);
		int target = Integer.parseInt(st.nextToken());
		int result = -1;

		while (!queue.isEmpty()){
			Node node = queue.poll();
			if (node.value > target) {
				continue;
			}

			long two = node.value*2;

			long one = Long.parseLong(node.value + "1");

			if (two==target || one==target	) {
				result=node.turn+1;
				break;
			}
			queue.add(new Node(two, node.turn+1));
			queue.add(new Node(one, node.turn+1));
		}
		bw.write(String.valueOf(result));



		bw.flush();
		br.close();
		bw.close();
	}

}
