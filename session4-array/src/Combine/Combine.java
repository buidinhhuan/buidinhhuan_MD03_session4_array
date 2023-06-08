package Combine;

import java.util.Arrays;

public class Combine {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < arr1.length) {
                newArray[i] = arr1[i];
            } else {
                newArray[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

