class Solution {
    public int myAtoi(String s) {
        char[] c = s.toCharArray();
        int num = 0;
        int something = 0;
        boolean isNeg = false;
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' '){
                if(something != 0 ) break;
                continue;
            }
            if((c[i] < '0' || c[i] > '9') && something != 0) break;
            if((c[i] < '0' || c[i] > '9') && c[i] != '-' && c[i] != '+') break;
            if(c[i] == '-'){
                if(isNeg != true){
                    isNeg = true;
                    something++;
                }
                else break; 
            }
            if(c[i] == '+'){
                something++;
                continue; 
            }
            if(c[i] >= '0' && c[i] <= '9'){
                int digit = c[i] - '0';
                if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)){
                    return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                num = num * 10 + digit;
                something++;
            }
        }
        if(isNeg == true) num = num * -1;
        return num;
    }
}