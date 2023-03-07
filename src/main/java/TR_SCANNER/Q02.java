package TR_SCANNER;

import java.util.Scanner;

public class Q02 {
    /*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
Ornek Cikti : Alan: 9    Cevre: 12
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Karenin kenar uzunluğunu giriniz: ");
        int a = input.nextInt();

        int alan = a*a;
        int cevre = 4*a;

        System.out.println("Alan: "+alan+"\nÇevre: "+cevre);

    }
}
