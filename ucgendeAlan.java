import java.util.Scanner;

public class ucgendeAlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("İlk kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü kenarı giriniz : ");
        c = input.nextInt();

        double u = (a + b + c) / 2;
        double cevre = 2 * u;

        System.out.println("Üçgenin çevresi = " + cevre);

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı = " + alan);


    }
}
