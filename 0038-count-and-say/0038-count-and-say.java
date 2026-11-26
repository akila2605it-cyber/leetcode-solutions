class Solution {
    public String countAndSay(int n) {
    String s = "1";
    for (int k = 1; k < n; k++) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < s.length()) {
    char ch = s.charAt(i);
    int count = 0;
    while (i < s.length() && s.charAt(i) == ch) {
    count++;
    i++;
    }
    result.append(count);
    result.append(ch);
    }
    s = result.toString();
        }
    return s;
    }
}
        
    
