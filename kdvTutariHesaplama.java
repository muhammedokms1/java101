import java.sql.Statement;
import java.util.Scanner;


public class kdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        double kdv1 = 0.18;
        double kdv2 = 0.8;

        System.out.print("Tutar giriniz : ");
        tutar = input.nextDouble();

        double kdvTutar = tutar * kdv1;
        double kdvliTutar = kdvTutar + tutar;
        double kdvTutar2 = tutar * kdv2;
        double kdvliTutar2 = tutar + kdvTutar2;
        if (tutar<0){

            System.out.println("Geçerli bir tutar giriniz.");
        }
        else if(tutar<1000){
            System.out.println("Kdv oranı : " + kdv1);
            System.out.println("Kdv tutarı : " + kdvTutar );
            System.out.println("Kdv'li tutar : " + kdvliTutar);
        }else if(tutar>1000){
            System.out.println("Kdv oranı : " + kdv2);
            System.out.println("Kdv tutarı : " + kdvTutar2 );
            System.out.println("Kdv'li tutar : " + kdvliTutar2);
        }


    }
}
