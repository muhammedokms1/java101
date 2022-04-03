import java.util.Scanner;

public class usluSayiHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,toplam = 1;
        System.out.print("Üssü alınacak sayi : ");
        sayi1 = input.nextInt();
        System.out.print("Üs olacak sayi : ");
        sayi2 = input.nextInt();

        for (int i=1;i<=sayi2;i++){
            toplam *= sayi1;

        }
        System.out.println("Sonuç : " + toplam);
    }
}
