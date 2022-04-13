import java.util.Scanner;

public class usluSayi {
    static int usluSayi(int a, int b) {
        if (b==0){
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b = input.nextInt();
        System.out.println("Sonuç : " + usluSayi(a, b));
    }
}
