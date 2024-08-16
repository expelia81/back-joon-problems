
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static int max;
	static int start;
	static int n;
	static int finalIndex=0;
	static int result=-1;
	static int[] arr;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 n = Integer.parseInt(st.nextToken());
		 start = Integer.parseInt(st.nextToken());
		 max = Integer.parseInt(st.nextToken());

		arr=new int[n+1];

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 1; i <= n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		visited = new boolean[n+1][max+1];
		dfs(start,1);

//		if(finalIndex!=n) {
//			bw.write("-1");
//		} else {
//		}
			bw.write(result+"");


		bw.flush();
		br.close();
		bw.close();
	}
	static boolean[][] visited;

	static void dfs(int start, int index) {
		if (n<index) {
			result=Math.max(result,start);
			return;
		}
		int soundSize = arr[index];
		int up = start+soundSize;
		int down = start-soundSize;

		if (up <= max) {
			if (!visited[index][up]) {
				finalIndex = Math.max(index,finalIndex);
				visited[index][up]=true;
				dfs(up,index+1);
			}
		}
		if (down >=0) {
			if (!visited[index][down]) {
				finalIndex = Math.max(index, finalIndex);
				visited[index][down]=true;
				dfs(down, index + 1);
			}
		}
	}

}
