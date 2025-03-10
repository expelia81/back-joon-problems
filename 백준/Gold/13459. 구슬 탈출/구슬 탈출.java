
import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	/**
	 *
	 * node에서, red가 들어간 순간에만 안들어가면 정답이다.
	 * 그런데, 현재 상태는 한 사이클 단위로만 틀어막고 있어서, bfs가 종료되는 조건을 사이클 단위가 아니고, 해당 스탭 탐색이 끝나고 종료조건인지 매번 확인해야함.
	 *
	 */
	static class Node {
		int[] blue=new int[2];
		int[] red=new int[2];
		int turn=0;

		public Node(Node origin) {
			blue = Arrays.copyOf(origin.blue,2);
			red = Arrays.copyOf(origin.red,2);
			turn = origin.turn+1;
		}

		public Node() {
		}
		// 1:게임성공 -1:게임실패 0:움직임완료
		void move(int i) {
			while (true) {
//				System.out.println("redTurn : "+redTurn + " blue turn : "+blueTurn + " realTurn : "+turn);
//				System.out.println("move..! red : "+red[0]+","+red[1] + " blue : "+blue[0]+","+blue[1]);
				int redMove=0;
				if (redTurn==11) {
					redMove=redMove(i);
					if (redMove==2) {
//						System.out.println("red goal!!!, red : "+red[0]+","+red[1] + " blue : "+blue[0]+","+blue[1] + " realTurn : "+turn);
						Main.redTurn=turn;
						red[0]=-1;
						red[1]=-1;
					}
				}
				int blueMove=0;
				if (blueTurn==11) {
					blueMove=blueMove(i);
//					System.out.println("blue is keep going...  blueMove : "+blueMove+" -- "+"red : "+red[0]+","+red[1] + " blue : "+blue[0]+","+blue[1]);
					if (blueMove==2) {
//						System.out.println("blue goal..., red : "+red[0]+","+red[1] + " blue : "+blue[0]+","+blue[1]);
						Main.blueTurn=turn;
						blue[0]=-1;
						blue[1]=-1;
					}
				}
				if ((redMove==0) && (blueMove==0)) {
					return ;
				}
			}
		}
		// 2:게임끝 1:움직임 0:더이상 움직일 수 없음
		int redMove(int i) {
//			x,y가 0이면 더이상 진행안하도록 해야함.
			int x=dx[i]+red[0];
			int y=dy[i]+red[1];
			if (x >= 0 && y >= 0 && x < arr[0].length && y<arr.length)
			if (arr[y][x]!='#' && !(blue[0]==x && blue[1]==y)) {
				red[0]=x;
				red[1]=y;
				if (arr[y][x]=='O') {
					return 2;
				}
				return 1;
			}
			return 0;
		}
		int blueMove(int i) {
			int x=dx[i]+blue[0];
			int y=dy[i]+blue[1];
			if (x >= 0 && y >= 0 && x < arr[0].length && y<arr.length)
			if (arr[y][x]!='#' && !(red[0]==x && red[1]==y)) { // 이동할 수 없는 곳인지 판정하는 부분에서 막힌다!!!
				blue[0]=x;
				blue[1]=y;
				if (arr[y][x]=='O') {
					return 2;
				}
				return 1;
			}
			return 0;
		}
	}
	static int[] dx={-1,1,0,0};
	static int[] dy={0,0,-1,1};
	static char[][] arr;
	static Queue<Node> queue = new ArrayDeque<>();
	static int blueTurn=11;
	static int redTurn=11;
	static boolean isEnd=false;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {


		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		arr = new char[y][x];
		Node node = new Node();
		queue.add(node);
		for (int i = 0; i < y; i++) {
			String s = br.readLine()	;
			for (int j = 0; j < x; j++) {
				arr[i][j]=s.charAt(j);
				if (arr[i][j]=='R') {
					node.red[0]=j;
					node.red[1]=i;
					arr[i][j]='.';
				}
				if (arr[i][j]=='B') {
					node.blue[0]=j;
					node.blue[1]=i;
					arr[i][j]='.';
				}
			}
		}
		bfs();

		if (isEnd) {
			bw.write("1");
		} else {
			bw.write("0");
		}

		bw.flush();
		br.close();
		bw.close();
	}

	/*
	  while문으로 파랑,빨강 구슬이 모두 움직일 수 없는 상태가 될 때까지 움직이는 것을 한 번의 움직임으로 한다.

	  방향은 dx,dy의 인덱스를 의미함.
	 */
	private static void bfs() throws IOException {
		while (!queue.isEmpty()) {
			Node node = queue.poll();
//			System.out.println(node.red[0]+","+node.red[1]);
			for (int i = 0; i < 4; i++) {
				Node leaf = new Node(node);
				if (node.turn > 9) {
//					if (redTurn==blueTurn) {
//						return ;
//					}
					return ;
				}
//				System.out.print("now leaf : ");
//				System.out.print(" --- red : "+leaf.red[0] +","+leaf.red[1]);
//				System.out.print(" --- blue : "+leaf.blue[0] +","+leaf.blue[1]);
//				System.out.println();
				leaf.move(i);


				if (redTurn!=11  && blueTurn==11) {
					isEnd=true;
				} else if (blueTurn!=11) {
					
				} else {
					queue.add(leaf);
				}
				redTurn=11;
				blueTurn=11;

			}
		}
	}
}