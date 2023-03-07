package TR_SYSO;

public class Q04 {
    /*Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    r=7;
    Pi=3.14
    Ipucu:    Dairenin Cevresi : 2*Pi*r
              Dairenin Alani   : Pi*r*r

    Ornek Cikti: 43.96
                 153.86
            */
    public static void main(String[] args) {
        double r = 7;
        double pi = 3.14;


        double cevre = 2*pi*r;
        double alan = pi*r*r;

        System.out.println(cevre);
        System.out.println(alan);
    }
}
