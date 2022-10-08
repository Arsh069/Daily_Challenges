/* 
 Rotate Image

 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */

class Solution {
    public void rotate(int[][] matrix) {
        int[][] n = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                n[i][j] = matrix[j][i];
            }
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = n[i][matrix.length-1-j];
            }
        }
    }
}