import java.util.Scanner;

public class daireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r;
        double 𝛼;
        double 𝜋 = 3.14;

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();
        System.out.print("Alfa açısını giriniz :");
        𝛼 = input.nextDouble();

       double alan = (𝜋 * (r*r) * 𝛼) / 360;
        System.out.println("Alan = " + alan);

    }
}
