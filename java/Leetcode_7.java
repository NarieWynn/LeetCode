public class Leetcode_7 {
    public int reverse(int x) {
        int original = x;
        int reversed= 0;
        while(x != 0){
            if(reversed >= Integer.MAX_VALUE/10 + 1 || reversed <= Integer.MIN_VALUE/10 - 1){
                return 0;
            }
            reversed *= 10;
            reversed = reversed + x%10;
            x= x/10;
        }
        return reversed;
    }
}
