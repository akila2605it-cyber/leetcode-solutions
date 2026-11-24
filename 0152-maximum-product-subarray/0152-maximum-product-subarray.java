class Solution {
    public int maxProduct(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int answer = nums[0];
    for (int i = 1; i < nums.length; i++) {
    int num = nums[i];
    int currentMax = Math.max(num, Math.max(max * num, min * num));
    int currentMin = Math.min(num, Math.min(max * num, min * num));
    max = currentMax;
    min = currentMin;
    answer = Math.max(answer, max);
        }
    return answer;
    }
}
        
    
