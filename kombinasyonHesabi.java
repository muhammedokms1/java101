import java.util.Scanner;

public class kombinasyonHesabi {
    public static void main(String[] args) {
        int num1, num2, dif = 0, faktoriyelToplam1 = 1, faktoriyelToplam2 = 1, faktoriyelDif = 1;
        Scanner input = new Scanner((System.in));
        System.out.print("ilk sayiyi giriniz:  ");
        num1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            dif = num1 - num2;
        } else if (num2 > num1) {
            dif = num2 - num1;
        }

        for (int i = 1; i < num1; i++) {
            faktoriyelToplam1 *= (i + 1);
        }
        for (int j = 1; j < num2; j++) {
            faktoriyelToplam2 *= (j + 1);
        }
        for (int k = 1; k < dif; k++) {
            faktoriyelDif *= (k + 1);
        }
        int sonuc = faktoriyelToplam1 / (faktoriyelToplam2 * faktoriyelDif);
        System.out.print("sonuç : " + sonuc);

    }
}


