class Solution {
    public void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        
        // matrix[0][0] is for the first row, and we are using an additional var for the col
        for(int i = 0; i < R; i++){
            if(matrix[i][0] == 0){
                isCol = true;
            }
        // check for the col
            for(int j = 1; j < C; j ++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
            }
        }
      }
      
      // iterate rows and cols again
      
      for(int i = 1; i < R; i ++){
          for(int j = 1; j < C; j ++){
              if(matrix[i][0] == 0 || matrix[0][j] == 0){ // this part is just doing what the question asked about
                  matrix[i][j] = 0;
              }
          }
      }
      
      // see if the first row needs to be zero
      if(matrix[0][0] == 0){ // this is the top far left element in the matrix
         for(int j = 0; j < C; j ++){
             matrix[0][j] = 0; // all the col in the first row have to be 0
         }
      }
      
      
      // see if the first col needs to be zero
      
      if(isCol){  
          for (int i = 0; i < R; i ++){
              matrix[i][0] = 0; // every row in the first col have to be 0
          }
      }        
    }
 }
 
 // Link: https://leetcode.com/problems/set-matrix-zeroes/
