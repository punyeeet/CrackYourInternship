class Solution {
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length,n=matrix[0].length;
        boolean col = false; //means col->0 is not filled with zeroes;
        // we maintain this col variable because matrix[0][0] is having col as well as row info
        //so we decide to store only row info in it;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                        matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else col = true;
                }
            }
        }

        
        for(int i=m-1;i>=0;i--)
            for(int j=n-1;j>=0;j--){
                if(j==0){
                    if(col || matrix[i][0]==0)matrix[i][j]=0;
                }
                else if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j] = 0;
            }

    }
