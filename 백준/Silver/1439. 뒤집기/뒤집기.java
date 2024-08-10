
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


		String s = br.readLine();

		char[] arr = s.toCharArray();

		int one = 0;
		int zero = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]=='1') {
				if (arr[i-1]=='0') {
					zero++;
				}
				if (i==arr.length-1) {
					if (zero!=0){
						one++;
					}
				}
			} else {
				if (arr[i-1]=='1') {
					one++;
				}
				if (i==arr.length-1) {
					if (one!=0){
						zero++;
					}
				}
			}
		}
		bw.write(String.valueOf(Math.min(one,zero)));


		bw.flush();
		br.close();
		bw.close();
	}

}
