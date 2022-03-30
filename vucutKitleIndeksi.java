import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kg;
        double boy;

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextInt();
        System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        double indeks = kg/(boy*boy);
        System.out.println("Vücut kitle indenksiniz = " + indeks);
    }
}
