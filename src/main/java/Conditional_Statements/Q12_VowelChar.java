package Conditional_Statements;

import java.util.Scanner;

/*
Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

Sesli harfler: a,e,i,o,u

 */
public class Q12_VowelChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir harf giriniz: ");
        String str = input.next().toLowerCase();

        if(str.length()==1){
           switch (str){
               case "a":
               case "e":
               case "i":
               case "u":
               case "o":
                   System.out.println("Girilen harf seslidir.");
                   break;
               default:
                   str = str.replaceAll("[a-z]","");
                   if (str.length()>0){
                       System.out.println("Harf değildir.");
                   }else{
                       System.out.println("Girilen harf sessizdir.");
                   }
                   break;
           }
        }else {
            System.out.println("Hatalı giriş");
        }

    }

}
