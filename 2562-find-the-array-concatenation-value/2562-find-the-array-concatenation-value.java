class Solution {
    public long findTheArrayConcVal(int[] nums) {
    long sum = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
    long concat = Long.parseLong(
    "" + nums[left] + nums[right]
     );
    sum = sum + concat;
    left++;
    right--;
        }
    if (left == right) {
    sum = sum + nums[left];
        }
    return sum;
    }
}

        
    
