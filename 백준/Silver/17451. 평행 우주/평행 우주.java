
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int[] arr;
		int turn;
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		/* 여러 정수 쓰는 경우 */
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		long speed = arr[n-1];
		for (int i = n-1; i >= 0; i--) {
			int thisTurn = arr[i];
			if (thisTurn >= speed) {
				speed = thisTurn;
			} else {
				if (speed%thisTurn!=0) {
					speed -= speed%thisTurn;
					speed += thisTurn;
				}
			}
		}
		bw.write(String.valueOf(speed));


		bw.flush();
		br.close();
		bw.close();
	}



}