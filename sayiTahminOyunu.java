import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);


        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        while (right < 5) {
            System.out.println("-----------------------------");
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğin sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı sayı girdiniz ! ");
                if (selected > number) {
                    System.out.println(selected + " sayısı, değerden büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, değerden küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkın : " + (5 - right));

            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            System.out.println("Doğru sayı : " + number);
        }

    }
}
