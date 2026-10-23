class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
        if (arr[end] == ' ' || end == arr.length - 1) {
        int left = start;
        int right = (arr[end] == ' ') ? end - 1 : end;
        while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
                }
             start = end + 1;
            }
        }
     return new String(arr);
    }
}
