package ColumSum;

public class ColumSum {
    public static void main(String[] args) {
        int[][] arrD = {{1, 2, 3}, {2, 3, 5}, {7, 9, 11}};
        int column = 1;
        int sum = 0;
        for (int i = 0; i < arrD.length; i++) {
            sum += arrD[i][column];
        }
        System.out.println("Tổng số của cột" + column + "là :" + sum);
    }
}
