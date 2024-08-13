
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

		String s = br.readLine();


		boolean hasZero = false;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int value = s.charAt(i)-'0';
			if(value==0){
				hasZero = true;
			}
			result+=value;
		}
		char[] arr = s.toCharArray();
		Arrays.sort(arr);

		if(hasZero && result%3==0) {
			for (int i = arr.length - 1; i >= 0; i--) {
				bw.write(arr[i]);
			}
		}else{
			bw.write("-1");
		}


		bw.flush();
		br.close();
		bw.close();
	}

}
