class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < num.length(); i++) {
    char ch = num.charAt(i);
    while (!stack.isEmpty() && k > 0 &&
     stack.peek() > ch) {
     stack.pop();
     k--;
            }
     stack.push(ch);
        }
     while (k > 0) {
     stack.pop();
     k--;
        }
     StringBuilder sb = new StringBuilder();
     for (char ch : stack) {
     sb.append(ch);
        }
      int i = 0;
      while (i < sb.length() && sb.charAt(i) == '0') {
      i++;
        }
      String result = sb.substring(i);
      if (result.length() == 0) {
      return "0";
        }
      return result;
    }
}
        
    
