package TR_IfSwitchTernaryStringMethods;
import java.util.Scanner;

public class Q02 {
    /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
    Input : John White
            1234234534561478
    Output :    Name : J*** W****
                CCN  : **** **** **** 1478
        * Ilk Harfler Buyuk harf ile baslamalidir.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve Soyad giriniz: ");
        String[] name = input.nextLine().split(" ");
        System.out.println("Kredi Kartı Numarasını Giriniz");
        String ccn = input.nextLine().replaceAll("\\D", "");

        String newName = "";
        String newCcn = "";
        String lastFourCcn = ccn.substring(ccn.length() - 4);

        for (String w : name) {
            String[] ch = w.split("");
            newName += ch[0].toUpperCase();
            for (int i = 1; i < w.length(); i++) {
                ch[i] = "*";
                newName += ch[i];
            }
            newName += " ";
        }
        int counter = 0;
        String[] cc = ccn.split("");

        for (int i = 0; i < ccn.length() - 4; i++) {
            cc[i] = "*";
            newCcn += cc[i];
            counter++;
            if (counter % 4 == 0 && counter != 0) {
                newCcn += "-";
            }
        }
        newCcn += lastFourCcn;
        System.out.println(newName);
        System.out.println(newCcn);
    }
}
