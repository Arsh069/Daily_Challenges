/*ZigZag Conversion 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility) */

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int check = 0;
        int sum = 0;
        
        while(sum < s.length()){
            sum += numRows;
            check++;
            if(sum >= s.length())
                break;
            sum += numRows - 2;
            check += numRows - 2;
        }
       
        char[][] mat = new char[numRows][check];
        
        int j = 0;
       
        
        int k = 0;
        while(j < s.length()){
        int i = 0;
        while(i<numRows){
            if(j >= s.length())
                break;
            mat[i][k] = s.charAt(j);
            j++;
            i++;
        }
        k++;
        int g =  numRows-2;
        while(g>0){
             if(j >= s.length())
                break;
            mat[g][k] = s.charAt(j);
            j++;
            k++;
            g--;
        }
          
       
      }
      
    s = "";
      
        for(int i=0;i<mat.length;i++){
            for( k = 0;k<check;k++){
                if(mat[i][k] != '\u0000')
                    s += mat[i][k];
            }
        }
        return s;
        
    }
}