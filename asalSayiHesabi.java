import java.util.Scanner;

public class asalSayiHesabi {
    static boolean asalSayi(int sayi) {
        boolean sayac = false;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac = true;

            }

        }
        return sayac;

    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        if (asalSayi(sayi)==true){
            System.out.println(sayi + " sayısı asal değildir!");
        }else{
            System.out.println(sayi + " sayısı asal bir sayıdır.");
        }
    }
}
