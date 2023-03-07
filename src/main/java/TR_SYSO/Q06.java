package TR_SYSO;

import java.util.Scanner;

public class Q06 {
    /*
Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
Ornek Cikti:  Sayilarin Ortalamasi : 30
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Beş Sayı Giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int ortalama = (a+b+c+d+e)/5;
        System.out.println("Sayıların Ortlamsı : "+ortalama);


    }
}
