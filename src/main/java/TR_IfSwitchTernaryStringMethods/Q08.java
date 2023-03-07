package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q08 {
    /*
    Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
INPUT   : Mustafa
OUTPUT  : fafafa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("En az iki karakter uzunluğunda bir isim giriniz:");
        String name = input.next();

        if (name.length()>1){
            String lastTwoChar = name.substring(name.length()-2);
            System.out.println(lastTwoChar.repeat(3));
        }else {
            System.out.println("Lütfen en az iki karakter uzunluğunda bir isim giriniz");
        }
    }
}
