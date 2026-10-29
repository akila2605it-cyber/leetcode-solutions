class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
        for (int j = 0; j < nums.length; j++) {
        if (nums[j] == -nums[i]) {
        max = Math.max(max, nums[i]);
        break;
                    }
                }
            }
        }
     return max;
    }
}

        
    
