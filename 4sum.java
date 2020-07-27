/*
Joseph

Difficulty:1 

Time: 5-10 minutes

Brute force approach. Go through everything find whatever works and add to set.
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        int N = nums.length;
        ArrayList ans  = new ArrayList();
        HashSet set = new HashSet();
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    for(int l = k+1; l < N; l++){
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        
                        if(sum == target){
                            ArrayList temp = new ArrayList();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            if(!set.contains(temp)){
                                set.add(temp);
                                ans.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
