class Solution {
    public void wiggleSort(int[] nums) {
    int[] arr = nums.clone();
    Arrays.sort(arr);
    int n = nums.length;
    int mid = (n + 1) / 2;
    int j = mid - 1;
    int k = n - 1;
    for (int i = 0; i < n; i++) {
    if (i % 2 == 0) {
    nums[i] = arr[j--];
    } else {
    nums[i] = arr[k--];
            }
        }
    }
}
        
    
