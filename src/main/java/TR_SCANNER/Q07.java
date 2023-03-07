package TR_SCANNER;

import java.util.Scanner;

public class Q07 {
    /*
    Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Double bir değer giriniz: ");
        double d = input.nextDouble();

        int i = (int) d;

        System.out.println(i);

    }


}
