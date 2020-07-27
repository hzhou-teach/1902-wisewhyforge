/*
Joseph Luo 

Runtime: 9 ms, faster than 37.31% of Java online submissions for 3Sum Closest.
Memory Usage: 39.4 MB, less than 14.70% of Java online submissions for 3Sum Closest.

Time: 5-10 minutes

Difficulty: 2

Brute Force Approach
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int N = nums.length;
        int lowSum = 0;
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < N && minDifference != 0; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j + 1; k < N; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(sum-target);
                    if(diff < minDifference){
                        minDifference = diff;
                        lowSum = sum;
                    }
                    
                }
            }
        }
        
        return lowSum;
    }
}
