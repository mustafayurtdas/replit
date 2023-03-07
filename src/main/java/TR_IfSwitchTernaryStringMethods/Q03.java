package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q03 {
    /*
    Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
Ornek:
INPUT      : 25 46
OUTPUT : Numaralarin Toplami: 71
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İki sayı giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        if ((sum) >= 1000000000) {
            System.out.println("Overflow");
        } else {
            System.out.println("Numaralarin Toplami: " + (num1 + num2));
        }
    }
}

