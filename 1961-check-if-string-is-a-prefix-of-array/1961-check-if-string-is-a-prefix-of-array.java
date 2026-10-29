class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
        result = result + words[i];
        if (result.equals(s)) {
        return true;
         }
         if (result.length() >= s.length()) {
         return false;
            }
        }
     return false;
    }
}

        
    
