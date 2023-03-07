package TR_SCANNER;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
INPUT:   Dakika sayısı: 3456789
OUTPUT : 3456789 dakika yaklaşık 6 yıl 210 gündür
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dakika giriniz");
        int minute = input.nextInt();

        int hour = minute/60;
        int day = hour/24;

        System.out.println(minute+" dakika yaklaşık "+day/365+" yıl "+ day%365+" gündür");
    }


}

