package TR_SCANNER;

import java.util.Scanner;

public class Q03 {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
Örnek Çıktı: Alan: 32  Çevre: 24
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdöregenin kenar uzunluklarını giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int alan = a*b;
        int cevre = 2*(a+b);

        System.out.println("Alan: "+alan+"\nÇevre: "+cevre);

    }
}

