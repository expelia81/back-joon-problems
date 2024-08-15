
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static boolean[][] arr;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int peeks = Integer.parseInt(st.nextToken());
		int songs = Integer.parseInt(st.nextToken());

		arr = new boolean[peeks][songs];

		for (int i = 0; i < peeks; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String peekName = st.nextToken();
			String possibleSongs = st.nextToken();

			for (int j = 0; j < songs; j++) {
				arr[i][j]=possibleSongs.charAt(j)=='Y';
			}
		}
		isVisited = new boolean[peeks];

		dfs(new int[songs],0);

		if (result==Integer.MAX_VALUE) {
			bw.write("-1");
		} else {
			bw.write(result+"");
		}


		bw.flush();
		br.close();
		bw.close();
	}

	static int result = Integer.MAX_VALUE;
	static int maxSongs = 0;

	static boolean[] isVisited;
	static void dfs(int[] canSing, int turn) {
//		System.out.println("peek 개수 : " + turn);
//		log(canSing);
		// 종료 조건
		int count = 0;
		for (int j : canSing) {
			if (j > 0) {
				count++;
			}
		}
		//
		if (maxSongs == count && maxSongs!=0) {
			result = Math.min(result,turn);
		}
		if (maxSongs < count) {
			maxSongs = count;
			result = turn;
//			System.out.println(maxSongs + " / "+result);
		}

		for (int i = 0; i < isVisited.length; i++) {
			if (isVisited[i]) {
				continue;
			}
			isVisited[i]=true;

			sung(canSing, i, 1);
			dfs(canSing, turn+1);
			sung(canSing, i, -1);

			isVisited[i]=false;
		}


	}
	static void log(int[] canSing) {
		for (int i = 0; i < canSing.length; i++) {
			System.out.print(canSing[i]+" ");
		}
		System.out.println();
	}
	static void sung(int[] canSing, int peek, int direction) {
		for (int i = 0; i < canSing.length; i++) {
			if (arr[peek][i]) {
				canSing[i]+=direction;
			}
		}
	}




}
