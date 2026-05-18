class Solution {
    public void rotate(int[][] matrix) {
         for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++){
            matrix[i] = reverseMatrix(matrix[i]);
        }
    }

     public static int[] reverseMatrix(int[] revMatrix){
        int i = 0;
        int j = revMatrix.length - 1;
        while (i < j) {
            int temp = revMatrix[i];
            revMatrix[i] = revMatrix[j];
            revMatrix[j] = temp;
            i++;
            j--;
        }
        return revMatrix;
    }
}