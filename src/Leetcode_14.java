class Leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        for(int i= 1; i < strs.length ; i++){
            while(strs[i].indexOf(strs[0]) != 0){
                strs[0]= strs[0].substring(0, strs[0].length() - 1);
            } 
        }
        return strs[0];
    }
}