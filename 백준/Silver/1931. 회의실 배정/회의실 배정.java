
import java.io.*;
import java.util.*;

public class Main {

	static class Node{
		int start;
		int end;

		public Node(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}
		public int getLength() {
			return start-end;
		}
	}

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());


		List<Node> arr = new ArrayList<>();
		StringTokenizer st;

		for (int i = 0; i <n; i++) {
			st= new StringTokenizer(br.readLine());
			arr.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		arr.sort(
						Comparator.comparing(Node::getEnd)
										.thenComparing(Node::getStart)
		);
		int end=0;
		int start = end;

		int result = 0;
		for (int i = 0; i < n; i++) {
			Node node = arr.get(i);
			if (end <= node.start) {
				end = node.end;
				result++;
			}
		}








		bw.write(result + "\n");


		bw.flush();
		br.close();
		bw.close();
	}

}
