package BigSmall;

public class BigSmall {
    public static void main(String[] args) {
        int [] arr = {3,1,22,7,19,12,8};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("gía trị nhỏ nhất trong mảng  là :" + min);
        System.out.println("gía trị lớn nhất trong mảng  là :" + max);
    }
}
