public class Leetcode_5 {
    public String longestPalindrome(String s) {
        int beginIndex= 0;
        int maxLen= 0;
        for(int i=0; i < s.length(); i++){
            int right = i;
            int left= i;
            while(right < s.length() -1 && s.charAt(i) == s.charAt(right + 1)){
                right++;
            }
            while(left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(right + 1)){
                left--;
                right++;
            }
            if( right - left + 1 > maxLen){
            beginIndex= left;

            maxLen= right - left + 1;
            }
        }
        return s.substring(beginIndex,beginIndex + maxLen);
    }
}
