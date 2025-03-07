
import java.io.*;
import java.util.*;public class Main {
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[4][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				arr[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		int[] left = new int[n*n];
		int[] right = new int[n*n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				left[i*n+j] = arr[0][i]+arr[1][j];
				right[i*n+j] = arr[2][i]+arr[3][j];
			}
		}
		Arrays.sort(left);
		Arrays.sort(right);

		long result = 0;
		for (int num : left) {

			int min = 0;
			int max = right.length-1;
			int mid = (max+min)/2;
			while (min <= max) {
				mid = (min+max)/2;

				int temp = num + right[mid];

				if (temp==0) {
					break;
				}
				if (temp > 0) {
					max = mid-1;
				}
				if (temp < 0) {
					min = mid+1;
				}
			}
//			System.out.println("left : " + num + " right : " + right.get(mid));
			if (num + right[mid] ==0) {
//				System.out.println("left : " + num + " right : " + right.get(mid));

				int leftBound = findLeftBound(right, -num);
				int rightBound = findRightBound(right, -num);
				result += (rightBound - leftBound + 1);
			}
		}

//		System.out.print("left("+right.size()+") : " + left.stream().map(String::valueOf).reduce("", (a,b)->a+" "+b));
//		System.out.println();
//		System.out.print("right("+right.size()+") : " + right.stream().map(String::valueOf).reduce("", (a,b)->a+" "+b));
//		System.out.println();

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}

	// 이진 탐색으로 타겟 값의 첫 번째 위치 찾기
	private static int findLeftBound(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				right = mid - 1; // 왼쪽 부분을 계속 탐색
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}
	// 이진 탐색으로 타겟 값의 마지막 위치 찾기
	private static int findRightBound(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				left = mid + 1; // 오른쪽 부분을 계속 탐색
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}
}