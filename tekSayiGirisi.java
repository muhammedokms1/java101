import java.util.Scanner;
//Ödev
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
// girişleri kabul eden ve girilen değerlerden çift ve 4'ün
// katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

public class tekSayiGirisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;


        do {
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();
            if (sayi%4==0){
                toplam += sayi;
            }

        } while (sayi%2==0);
        System.out.println("Toplam = "+ toplam);
    }
}
