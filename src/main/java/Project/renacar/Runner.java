package Project.renacar;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MusteriveAracBilgileri user=new MusteriveAracBilgileri();
        // user.aractalep();
        // user.aracBilgisi();
        user.musteriBilgileri();
    }
}
