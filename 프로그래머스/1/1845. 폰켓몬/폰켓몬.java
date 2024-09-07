import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        answer = (int)Arrays.stream(nums)
            .distinct()
            .count();
        
        answer = Math.min(nums.length/2,answer);
        
        
        return answer;
    }
}