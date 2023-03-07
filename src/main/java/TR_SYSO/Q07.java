package TR_SYSO;

public class Q07 {
    /*
    Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
    int a= 3;
    int b= 5;

    Ornek Cikti:
    a=5
    b=3
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
