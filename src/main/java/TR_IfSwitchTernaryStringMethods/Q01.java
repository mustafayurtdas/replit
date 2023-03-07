package TR_IfSwitchTernaryStringMethods;

import java.util.Scanner;

public class Q01 {
    /*Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez
Input:
Output:
Agirlik : 71
Boy : 1,72
BMI : 23.99945916711736
Zayifsiniz.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Metre cinsinden Giriniz");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu Kilogram cinsinden Giriniz");
        double kilo = input.nextDouble();

        double bmi = kilo / (boy*boy);

        if (bmi<18.5){
            System.out.println("BMİ: "+String.format("%.2f",bmi)+" Zayıfsınız.");
        } else if (bmi<25) {
            System.out.println("BMİ: "+String.format("%.2f",bmi)+" İdeal Kilo.");
        } else if (bmi<30) {
            System.out.println("BMİ: "+String.format("%.2f",bmi)+" Şişmansınız!..");
        } else {
            System.out.println("BMİ: "+String.format("%.2f",bmi)+" Obezsiniz!!!");
        }

    }
}
