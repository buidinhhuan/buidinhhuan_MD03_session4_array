package More;

import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        //khai báo mảng
        int[] arr = {2,3,4,2,1,7};
        //tạo kich thước lớn hơn mảng ban đầu
        int[] arrUpdate = new int[arr.length + 1];
        //sao chép các phần tử của mảng ban đầu sang mảng mới
        for (int i = 0; i <arr.length ; i++) {
            arrUpdate[i] =arr[i];
        }
        //thêm phần tử vào cuối mảng
        arrUpdate[arrUpdate.length -1] = 9;
        System.out.println("mang mới sẽ là"+ Arrays.toString(arrUpdate));
    }

}
