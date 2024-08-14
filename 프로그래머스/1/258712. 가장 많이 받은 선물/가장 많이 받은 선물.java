import java.util.*;
class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static int[] presented;
    static int[][] give;
    static int[] result;
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        presented = new int[friends.length];
        give = new int[friends.length][friends.length];
        result = new int[friends.length];
        
        for(int i=0;i<friends.length;i++) {
            map.put(friends[i],i);
        }
        for(int i=0;i<gifts.length;i++) {
            int start = map.get(gifts[i].split(" ")[0]);
            int end = map.get(gifts[i].split(" ")[1]);
            
            // System.out.println(friends[start] + " -> " + friends[end]);
            
            
            // 선물지수 계산
            presented[start]++;
            presented[end]--;
            
            // 관계
            give[start][end]++;
        }
        
        
        for(int i=0;i<friends.length-1;i++) {
            for(int j=i+1;j<friends.length;j++) {
                getResult(i,j);
            }
        }
        
//         for(int i=0;i<friends.length;i++) {
//             System.out.println(friends[i] + " 의 선물 지수 : " + presented[i]);
//         }
        
//         for(int i=0;i<friends.length;i++) {
//             for(int j=0;j<friends.length;j++) {
//                 System.out.println(friends[i] + " -- " + give[i][j] + " --> " + friends[j]);
//             }
//         }
        
        
        for(int i =0 ; i< result.length;i++) { 
            // System.out.println(friends[i]+ " 의 선물받아야할 갯수 : " + result[i]);
            answer = Math.max(result[i],answer);
        }
        
        
        
        return answer;
    }
    
    static void getResult(int start, int end) {
        // end가 받은 갯수
        int endPresentedCount = give[start][end];
        // start가 받은 갯수
        int startPresentedCount = give[end][start];
        
//         int endPresentValue = presendted[end];
//         int startPresentValue = presented[start];
        
        if(startPresentedCount > endPresentedCount) {
            // 시작이 더 많이 받았음
            result[end]++;
        } else if (endPresentedCount > startPresentedCount) {
            result[start]++;
        } else {
            // 주고받은 선물 갯수가 같다면, 선물지수가 높은 쪽이 선물을 받는다.
            if(presented[start] > presented[end]) {
                // System.out.println
                result[start]++;
            } else if(presented[start] < presented[end]) {
                result[end]++;
            }
        }
    }
}