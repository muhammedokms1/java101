import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int tarih;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        tarih = input.nextInt();


        if (tarih % 4 == 0) {
            if (tarih%100==0 && tarih%400!=0) {
                System.out.println(tarih + " Artık yıl değildir !");
            } else {
                System.out.println(tarih + " Artık yıldır !");
            }

        } else {
            System.out.println(tarih + " Artık Yıl Değildir !");
        }
    }
}
