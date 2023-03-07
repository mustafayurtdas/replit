package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q06 {
    /*
    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
Eger aynı karakterlere sahipse "isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse "Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üç harfli bir isim giriniz:");
        String name = input.next().substring(0, 3);

        char a = name.charAt(0);
        char b = name.charAt(1);
        char c = name.charAt(2);

        String message = a == b || a == c || b == c ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var";

        System.out.println(message);

    }
}
