class Solution {
    public int getMoneyAmount(int n) {
    int[][] dp = new int[n + 2][n + 2];
    for (int len = 2; len <= n; len++) {
    for (int low = 1; low <= n - len + 1; low++) {
    int high = low + len - 1;
    dp[low][high] = Integer.MAX_VALUE;
    for (int k = low; k < high; k++) {
    int cost = k + Math.max(dp[low][k - 1], dp[k + 1][high]);
    dp[low][high] = Math.min(dp[low][high], cost);
                }
            }
        }
    return dp[1][n];
    }
}