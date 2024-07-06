
import java.io.*;
import java.util.BitSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {



	private static int[][] arr;

	private static int result=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		/* 여러 정수 쓰는 경우 */
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		arr=new int[n+1][n+1];

		/* 배열 필요한 경우 */
		for (int i = 1; i < n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			arr[left][right]=arr[right][left]=Integer.parseInt(st.nextToken());
		}

		dfs(a,0,0,new BitSet(n+1), b);

		bw.write(result+"");



		bw.flush();
		br.close();
		bw.close();
	}


	private static void dfs(int index, int max, int sum, BitSet isVisited, int target) {
		if (index==target) {
			result=Math.min(sum-max,result);
			return;
		}
		isVisited.set(index);

		for (int i = 1; i < arr.length; i++) {
			if (arr[index][i]!=0 && !isVisited.get(i)) {
				BitSet bitSet = (BitSet) isVisited.clone();
				dfs(i, Math.max(max,arr[index][i]),sum+arr[index][i],bitSet,target);
			}
		}
	}
}