import java.util.Scanner;

public class fibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0;
        int sayi;
        int b = 1;
        int toplam;

        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        sayi = input.nextInt();
        for (int i=0;i<=sayi;i++){
            toplam = a + b;
            System.out.println(a + "+" + b + "=" + toplam);
            a = b;
            b = toplam;


        }
    }
}
