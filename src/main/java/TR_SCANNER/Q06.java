package TR_SCANNER;

import java.util.Scanner;

public class Q06 {
    /*
    Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Float bir değer giriniz: ");
        float f = input.nextFloat();

        short s = (short) f;

        System.out.println(s);

    }

}
