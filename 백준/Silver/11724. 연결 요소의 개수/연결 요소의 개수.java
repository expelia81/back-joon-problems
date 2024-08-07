
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<Integer>[] graph;
	static int[] parent;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		/* 여러 정수 쓰는 경우 */
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		parent = new int[n+1];

		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a,b);
		}

		for (int i = 1; i <= n; i++) {
			find(i);
		}

//		for (int i = 1; i <= n; i++) {
//			find(i);
//		}

		int result = 0;
		Arrays.sort(parent);
		for (int i = 1; i <= n; i++) {
//			System.out.println(parent[i]	);
			if (parent[i-1]!=parent[i]) {
				result++;
			}
		}
//		long result = Arrays.stream(parent)
//						.distinct()
//						.count();

		bw.write(String.valueOf(result));


		bw.flush();
		br.close();
		bw.close();
	}

	static int find(int x) {
		if (parent[x]==x) return x;

		return parent[x]=find(parent[x]);
	}

	static void union(int a, int b) {
		int findA = find(a);
		int findB = find(b);

		if (findA == findB) {
			return ;
		}

		if (a>=b) {
			parent[findB]=findA;
		} else {
			parent[findA]=findB;
		}
	}



}