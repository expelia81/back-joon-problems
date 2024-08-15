import java.util.*;
class Solution {
    Queue<Node> dq = new LinkedList<>();
    Queue<Node> pq = new LinkedList<>();
    public static class Node {
        int index;
        public Node(int input) {
            index = input+1;
        }
    }
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        for(int i=n-1; i>=0; i--) {
            int d = deliveries[i];
            int p = pickups[i];
            for(int j=0;j<d;j++) {
                dq.add(new Node(i));
            }
            for(int j=0;j<p;j++) {
                pq.add(new Node(i));
            }
        }
        
        
        while(!dq.isEmpty() || !pq.isEmpty()) {
            int maxIndex = 0;
            for(int i = 0; i<cap; i++) {
                if(!dq.isEmpty()) {
                    Node node = dq.poll();
                    maxIndex = Math.max(node.index, maxIndex);
                }
                if(!pq.isEmpty()) {
                    Node node = pq.poll();
                    maxIndex = Math.max(node.index, maxIndex);
                }
            }
            answer+=maxIndex * 2;
        }
        
        
        return answer;
    }
}