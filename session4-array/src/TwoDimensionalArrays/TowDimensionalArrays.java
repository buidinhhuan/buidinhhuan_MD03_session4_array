package TwoDimensionalArrays;

public class TowDimensionalArrays {
    public static void main(String[] args) {
        //khởi tạo mảng 2 chiều
        int[][] arrD = {{1, 2, 3}, {12, 35, 57}, {23, 40, 45}};
        //tính tống sô trong mang 2 chiều
        int sum = 0;
        for (int i = 0; i < arrD.length; i++) {
            for (int j = 0; j < arrD[i].length; j++) {
                sum += arrD[i][j];
            }
        }
        System.out.println("Tổng sô của mảng 2 chiều là : " + sum);
    }
}
