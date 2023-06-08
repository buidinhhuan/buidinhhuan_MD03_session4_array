package Count;

import java.util.Scanner;

public class Count {
    // Phương thức để đếm số lần xuất hiện của ký tự trong chuỗi

    public static int CharacterCount(String input , char character) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character){
                count++;
            }
        }
        return count;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String input = sc.nextLine();
        char character = 'i';
        // Gọi phương thức CharacterCount để đếm số lần xuất hiện của ký tự 'n' trong chuỗi input
        int occurrences = CharacterCount(input,character);
        System.out.println("Số lần xuất hiện của ký tự '" + character + "' trong chuỗi '" + input + "' là: " + occurrences);

    }
}

