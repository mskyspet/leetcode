package noreason.me.leetcode.algorithms;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 */
public class _304 {

    private int[][] matrix;
    private int[][] cached;

    public _304(int[][] matrix) {
        int height = matrix.length;
        if (height==0) return;
        int width = matrix[0].length;
        cached = new int[height][width];

        //初始化第一列
        int sum = 0;
        for (int i=0;i<height;i++) {
            sum += matrix[i][0];
            cached[i][0] = sum;
        }
        //初始化第一行
        sum = 0;
        for (int i=0;i<width;i++) {
            sum += matrix[0][i];
            cached[0][i] = sum;
        }
        //初始化剩余的
        for (int i=1;i<height;i++){
            for(int j=1;j<width;j++){
                cached[i][j] = cached[i-1][j]+cached[i][j-1]-cached[i-1][j-1]+matrix[i][j];
            }
        }
    }

    public void PrintCache(){
        int height = this.cached.length;
        for (int i=0;i<height;i++){
            int[] thisArray = this.cached[i];
            System.out.print("[");
            for (int j=0;j<thisArray.length;j++){
                System.out.print(thisArray[j]+", ");
            }
            System.out.println("],");
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (this.cached==null) return 0;
        if (col1==0 && row1==0)
            return this.cached[row2][col2];
        if (col1==0)
            return this.cached[row2][col2] - this.cached[row1-1][col2];
        if (row1==0)
            return this.cached[row2][col2] - this.cached[row2][col1-1];

        return this.cached[row2][col2] - this.cached[row1-1][col2] - this.cached[row2][col1-1] + this.cached[row1-1][col1-1];
    }


    public static void main(String[] args){
        int[][] matrix = {
            {3,0,1,4,2},
            {5,6,3,2,1},
            {1,2,0,1,5},
            {4,1,0,1,7},
            {1,0,3,0,5}
        };

        _304 instance = new _304(matrix);
        instance.PrintCache();
        System.out.println(instance.sumRegion(2,1,4,3));

    }

// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
}
