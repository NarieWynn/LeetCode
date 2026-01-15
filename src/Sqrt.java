class Sqrt{
    public int mySqrt(int x) {
        int left= 0;
        int right= x;
        if(x<2){
                return x;
            }
        while(left<= right){
            int mid= left + (right-left)/2;
            if(mid== x/mid){
                return mid;
            }
            if(mid < x/mid){
                left= mid+1;
            }
            if(mid> x/mid){
                right= mid-1;
            }
        }
        return right;
    }
}