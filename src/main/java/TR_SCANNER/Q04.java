package TR_SCANNER;

import java.util.Scanner;

public class Q04 {
    /*
    Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
    1 şeker = 1.7 gr   Örnek Çıktı: Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Günde kaç bardak çay içersiniz? ");
        int tea = input.nextInt();
        System.out.println("Kaç şekerli içersiniz? ");
        int sugar = input.nextInt();
        double sumSugar = sugar * tea * 1.7/1000 *365;

        System.out.println("Yılda "+String.format("%.2f",sumSugar)+ " kg şeker kullanıyor");








    }

}
