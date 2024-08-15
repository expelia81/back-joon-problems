
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static int[] chars = new int[26];
	static int n;
	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		n = s.length();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			chars[getIndex(ch)]++;
		}

		dfs(-1,0);

		if (n==0) {
			bw.write("0");
		} else {
			bw.write(result+"");
		}


		bw.flush();
		br.close();
		bw.close();
	}

	static int result = 0;
	static void dfs(int pre, int turn) {
		if (turn==n) {
			result++;
			return;
		}

		for (int i = 0; i < 26; i++) {
			if (chars[i]!=0 && pre!=i) {
				chars[i]--;
				dfs(i,turn+1);
				chars[i]++;
			}
		}
	}

	static char getChar(int index) {
		return (char) (index+'a');
	}

	static int getIndex(char ch) {
		return ch-'a';
	}



}
