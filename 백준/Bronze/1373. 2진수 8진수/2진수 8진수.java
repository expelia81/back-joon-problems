
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = s.length();
		if (n%3 == 1) { //세 자리씩 끊었을 때 맨 앞에 한 자리만 남는경우
			System.out.print(s.charAt(0));
		} else if (n%3 == 2) { //두 자리만 남는경우
			System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
		}
		//나머지 경우
		for (int i=n%3; i<n; i+=3) {
			System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
		}
	}

}
