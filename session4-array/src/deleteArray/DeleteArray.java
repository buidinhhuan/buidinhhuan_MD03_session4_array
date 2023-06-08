package deleteArray;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 7,9, 2, 3, 4, 5};
        System.out.println("Nhập số bạn muốn xoá: ");
        int num = sc.nextInt();

        int count = 0; // Số lượng phần tử không trùng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                count++;
            }
        }

        int[] arr2 = new int[count]; // Mảng mới chứa các phần tử không trùng

        int index = 0; // Vị trí hiện tại trong mảng arr2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr2[index] = arr[i];
                index++;
            }
        }

        System.out.println("Mảng sau khi xoá là: " + Arrays.toString(arr2));
    }
}

