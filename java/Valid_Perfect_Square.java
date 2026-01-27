/**
 * Algorithm: Binary Search
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        int left= 0;
        int right= num;
        if(num< 2) return true;
        while(left<= right){
            int mid= left + (right- left)/2;
            if(mid== num/mid && num % mid== 0){
                return true;
            }
            if(mid>= num/mid){
                right= mid -1;
            }
            if(mid <= num/mid){
                left= mid +1;
            }
        }
        return false;
    }
}
