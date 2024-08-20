
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		List<String> list = new ArrayList<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (sb.isEmpty()) {
				sb.append(ch);
			} else {
				char first = sb.charAt(0);
				if (ch==first) {
					sb.append(ch);
				} else {
					list.add(sb.toString());
					sb = new StringBuilder();
					sb.append(ch);
				}
			}
		}
		list.add(sb.toString());

		sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			if (temp.charAt(0)=='.') {
				sb.append(temp);
				continue;
			}
			if (temp.length()%2==1) {
				System.out.println("-1");
				return;
			}
			int size = temp.length();
			while (size>0) {
				if (size >= 4) {
					size-=4;
					sb.append("AAAA");
				} else {
					size-=2;
					sb.append("BB");
				}
			}
		}

		bw.write(sb.toString());


		bw.flush();
		br.close();
		bw.close();
	}

}