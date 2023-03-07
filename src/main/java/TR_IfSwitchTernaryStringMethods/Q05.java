package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q05 {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
INPUT: Ay Numarasi: 2  Yil : 2016
OUTPUT  : Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ay numarası giriniz:");
        int monthNum = input.nextInt();
        System.out.println("Yılı giriniz:");
        int year = input.nextInt();

        switch (monthNum){
            case 1 :
                System.out.println("Ocak "+year+" 31 gündür.");
                break;
            case 3 :
                System.out.println("Mart "+year+" 31 gündür.");
                break;
            case 5 :
                System.out.println("Mayıs "+year+" 31 gündür.");
                break;
            case 7 :
                System.out.println("Temmuz "+year+" 31 gündür.");
                break;
            case 8 :
                System.out.println("Ağustos "+year+" 31 gündür.");
                break;
            case 10 :
                System.out.println("Ekim "+year+" 31 gündür.");
                break;
            case 12 :
                System.out.println("Aralık "+year+" 31 gündür.");
                break;
            case 4 :
                System.out.println("Nisan "+year+" 30 gündür.");
                break;
            case 6 :
                System.out.println("Haziran "+year+" 30 gündür.");
                break;
            case 9 :
                System.out.println("Eylül "+year+" 30 gündür.");
                break;
            case 11 :
                System.out.println("Kasım "+year+" 30 gündür.");
                break;
            case 2:
                System.out.println((year%100==0) ? ( (year%400==0) ? ("Şubat "+year+" 29 gündür.") : ("Şubat "+year+" 28 gündür.") )
                        : ( (year%4==0 ? ("Şubat "+year+" 29 gündür.") : ("Şubat "+year+" 28 gündür.") )));
                break;
            default:
                System.out.println("Hatalı Ay Numarası Girdiniz");

        }

    }

}
