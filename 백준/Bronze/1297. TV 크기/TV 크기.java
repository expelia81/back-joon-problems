import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		double tv = Math.sqrt(Math.pow(num[0],2) / ( Math.pow(num[1],2) + Math.pow(num[2],2) ));
		System.out.printf("%d %d",(int)Math.floor(tv * num[1]), (int)Math.floor(tv * num[2]));
	}

}