import java.util.Scanner;

public class sayilariSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayiyi giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü sayiyi giriniz : ");
        sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println(sayi1 + " < " + sayi2 + " < " + sayi3);
            } else {
                System.out.println(sayi1 + " < " + sayi3 + " < " + sayi2);
            }

        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println(sayi2 + " < " + sayi1 + " < " + sayi3);
            } else {
                System.out.println(sayi2 + " < " + sayi3 + " < " + sayi1);
            }

        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            if (sayi2 < sayi1) {
                System.out.println(sayi3 + " < " + sayi2 + " < " + sayi1);
            } else {
                System.out.println(sayi3 + " < " + sayi1 + " < " + sayi2);
            }
            

        }
    }
}

