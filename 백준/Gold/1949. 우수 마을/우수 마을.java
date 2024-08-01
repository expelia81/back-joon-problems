
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int index;
		int human;

		Node parent;
		List<Node> list = new ArrayList<>();

		public Node(int i, int value) {
			index=i;
			human=value;
		}

		public void setParent(Node parent) {
			this.parent=parent;
			list.remove(parent);
		}
	}

	static void createRoad(int start, int end) {
		nodes[start].list.add(nodes[end]);
		nodes[end].list.add(nodes[start]);
	}

	static Node[] nodes;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		nodes=new Node[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			nodes[i]=new Node(i,Integer.parseInt(st.nextToken()));
		}

		/* 여러 정수 쓰는 경우 */
		int start;
		int end;

		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			createRoad(start, end);
		}

		Node root = nodes[1];
		findTree(root);
//		preOrder(root);

		// 1,2는 우수마을인지아닌지 기준.
		dp = new int[n+1][2];
		findDp(root,0);
		findDp(root, 1);

//		String dp1 = "";
//		String dp0 = "";
//		for (int i = 1; i <= n; i++) {
//			dp0 += dp[i][0] + " ";
//			dp1 += dp[i][1] + " ";
//		}
//		System.out.println(dp0);
//		System.out.println(dp1);

		bw.write(Math.max(dp[1][0],dp[1][1])+"");

		// 부모가 우수마을이 아니면, 1개 이상의 자식은 우수마을이어야함.
		bw.flush();
		br.close();
		bw.close();
	}

	private static int findDp(Node node, int isGood) {
		if (dp[node.index][isGood] != 0) {
			return dp[node.index][isGood];
		}
		if (isGood==1) {
			dp[node.index][1]+=node.human;
			for (Node child : node.list) {
				dp[node.index][1]+=findDp(child,0);
//				for (Node grandChild : child.list) {
////					dp[node.index][1]+=findDp(grandChild,1);
//				}
			}
		} else {
			for (Node child : node.list) {
				dp[node.index][0]+=Math.max(findDp(child,1), findDp(child,0));
//				for (Node grandChild : child.list) {
////					dp[node.index][0]+=findDp(grandChild,0);
//				}
			}
		}
		return dp[node.index][isGood];
	}

	static int[][] dp;

	static void preOrder(Node node) {
		for (Node child : node.list) {
			preOrder(child);
		}
		System.out.println(node.index);
	}

	static void findTree(Node node) {
		for (Node child : node.list) {
			if (child.parent==null) {
				child.setParent(node);
				findTree(child);
			}
		}
	}


}