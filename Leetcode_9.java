public class Leetcode_9 {
    public boolean isPalindrome(int x) {
        long reversed= 0;
        int original = x;
        if(x < 0){ return false; }
        if(x < 10){ return true; }
        while(x > 0){
            reversed= reversed * 10 + x%10;
            x= x/10;
        }
        return reversed== original ;
    }
}
