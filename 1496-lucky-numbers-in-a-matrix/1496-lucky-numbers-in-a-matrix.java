class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
                List<Integer> luckyNumbers = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minVal = matrix[i][0];
            int minColIdx = 0;
            
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minColIdx = j;
                }
            }
            
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minColIdx] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if (isMaxInCol) {
                luckyNumbers.add(minVal);
            }
        }
        
        return luckyNumbers;
    }
}