package TR_SCANNER;

import java.util.Scanner;

public class Q08 {
    /*
Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
Örnek Çıktı:   Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üç Basamaklı bir sayı giriniz: ");

        int num = input.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i%10;
        }

        System.out.println("Verilen tamsayının rakamları toplamı "+sum+"'dır/dur");


    }


}
