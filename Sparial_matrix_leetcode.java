class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while(list.size() < matrix.length * matrix[0].length){
            for(int i = colStart; i <= colEnd; i++){
                list.add(matrix[rowStart][i]);
            }

            for(int i = rowStart + 1; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }

            if(rowStart != rowEnd){
                for(int i = colEnd - 1; i >= colStart; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }

            if(colStart != colEnd){
                for(int i = rowEnd - 1; i >= rowStart + 1; i--){
                    list.add(matrix[i][colStart]);
                }
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }

        return list;
    }
}
