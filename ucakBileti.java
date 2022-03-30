import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, yas, tur, mesafe = 0.1, toplam, yasIndirimi = 1, gidisDonusIndirimi = 1;

        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextDouble();

        System.out.print("Yaşınız : ");
        yas = input.nextDouble();

        System.out.println("Tek yön için 1'i Gidiş Dönüş için 2'yi Tuşlayınız : ");
        tur = input.nextDouble();

        if (km < 0 || yas < 0 || tur < 0 || tur > 2) {
            System.out.println("Please check the information that you provided.");
        } else {

            if (yas < 12) {
                yasIndirimi = 0.5;
            } else if (yas >= 12 && yas < 24) {
                yasIndirimi = 0.9;
            } else if (yas > 65) {
                yasIndirimi = 0.7;
            }

            if (tur == 2) {
                gidisDonusIndirimi = 1.6; // multiply with 2 (round-trip), then 0.8 for discount.
            }

            toplam = km * mesafe * yasIndirimi * gidisDonusIndirimi;
            System.out.print("Toplam Tutar " + toplam);


        }
    }
}

