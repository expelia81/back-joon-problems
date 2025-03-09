
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());


		Queue<Integer> pq = new PriorityQueue<>();
		Deque<Integer> deque = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>();

		list.add(Integer.MIN_VALUE);


		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
		}

		for (int i = 1; i <= n; i++) {
//			int start = Math.max(1, i-l+1);
			int start = i+1-l;
			int end = i;
			list.add(Integer.parseInt(st.nextToken()));

			while (!deque.isEmpty()) {
				if (deque.getFirst() > end || deque.getFirst() < start) {
					deque.removeFirst();
				} else {
					break;
				}
			}
			while (!deque.isEmpty()) {
				if (list.get(i) < list.get(deque.getLast())) {
					deque.removeLast();
				} else {
					break;
				}
			}
			deque.add(i);

			bw.write(list.get(deque.getFirst())+" ");
		}







		bw.flush();
		bw.close();
		br.close();
	}
}
