package ArrayDemo;
//旋转矩阵
public class Solution_3 {

    public void rotate(int[][] matrix) {
        int[][] temp=new int[matrix.length][matrix[0].length];

        for(int i=matrix.length-1;i>=0;i--){
            int column=0;
            temp[0][column]=matrix[i][0];
            temp[1][column]=matrix[i][1];
            temp[2][column]=matrix[i][2];
            column++;
        }
        matrix=temp;
    }
}
