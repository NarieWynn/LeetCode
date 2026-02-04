public class Leetcode_6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) { return s; }
        StringBuilder[] rows= new StringBuilder[numRows];
        char [] c= s.toCharArray();
        int currRow = 0;
        int direction = 1;
        for(int i=0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }
        for(int j=0; j < c.length; j++){
            if(currRow == 0){ direction = 1; }
            rows[currRow].append(c[j]);
            if(currRow == numRows - 1){ direction = -1; }
            currRow = currRow + direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) { result.append(row); }
        return result.toString();
    }
}
