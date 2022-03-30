import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        System.out.print("Armut kaç kilo : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muzKilo = input.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        patlicanKilo = input.nextDouble();

        double toplam = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam tutar = " + toplam);


    }
}

