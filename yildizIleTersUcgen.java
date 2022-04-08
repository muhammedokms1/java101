import java.util.Scanner;

public class yildizIleTersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();


        for (int a = 0; a <= sayi; a++) {
            for (int l = 1; l < a + 1; l++) {
                System.out.print(" ");
            }

            for (int b = 0; b <= 2 * (sayi - a); b++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
