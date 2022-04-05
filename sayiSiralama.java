import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sayi, min = 0, max = 0;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();
        if (n == 1) {
            System.out.println("Karşılaştırma yapmak için en az iki sayı gerekmektedir.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". Sayıyı giriniz : ");
                sayi = input.nextInt();
                if (sayi > max) {
                    if (min == 0) {
                        min = sayi;
                    }
                    max = sayi;
                } else if (sayi < min) {

                    min = sayi;
                }
            }
            System.out.println("En büyük sayi : " + max);
            System.out.println("En küçük sayi : " + min);
        }
    }
}
