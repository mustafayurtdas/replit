package TR_SCANNER;

import java.util.Scanner;

public class Q01 {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz: ");
        int num = input.nextInt();

        System.out.println(num * num * num / 2);

    }
}
