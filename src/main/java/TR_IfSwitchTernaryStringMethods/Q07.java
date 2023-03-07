package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q07 {
    /* 2 kelime oluşturun: isim1 ve isim2
isim1 çift sayıda karakter içeriyorsa, ikinci kelimeyi ilk adın ortasına yerleştirin
ilk kelime tek sayida karakter iceriyorsa “isim1, isim2 ye eklenemiyor” yazdırın
 Örneğin:     isim1= mehmet    isim2= ahmet  Yazdır ==> mehahmetmet
              isim1= memet     isim2= ahmet  Yazdır ==> isim1, isim2 ye eklenemiyor
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sırayla İki İsim Giriniz:");

        String isim1 = input.next();
        String isim2 = input.next();

        if (isim1.length()%2==0){
            String isim = isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2);
            System.out.println(isim);

        }else {
            System.out.println(isim2 + ", "+isim1 + " e eklenemiyor.");
        }
    }
}
