package TR_SCANNER;

import java.util.Scanner;

public class Q09 {
    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.
Örnek Çıktı: 1 saat 10 dakika 50 saniye ==> 4250 saniye
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sırasıyla saat dakika ve saniye bilgilerini giriniz: ");
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();

        int sum = hour*3600+minute*60+second;

        System.out.println(hour+" saat "+minute+" dakika "+second+" saniye ==> "+sum+" saniye");

    }
}
