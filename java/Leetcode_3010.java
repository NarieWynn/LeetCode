public class Leetcode_3010 {
    public int minimumCost(int[] nums) {
        int m1= Integer.MAX_VALUE;
        int m2= Integer.MAX_VALUE;
        if(nums.length == 3){ return nums[0] + nums[1] + nums[2]; }
        for(int i=1; i < nums.length; i++){
            if(nums[i] < m1){
                m2= m1;
                m1= nums[i];
            }   
            else if(nums[i] < m2){ m2= nums[i]; }
        }
        return nums[0] + m1 + m2;
    }
}
