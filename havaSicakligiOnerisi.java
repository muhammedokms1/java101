import java.util.Scanner;

public class havaSicakligiOnerisi {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava kaç derece : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapmalısın !");
        }
        else if(sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gitmelisin !");
        }

        else if (sicaklik>15 && sicaklik<=25){
            System.out.println("Pikniğe gitmelisin !");
        }

        else if (sicaklik>25){
            System.out.println("Yüzmeye gitmelisin !");
        }

    }
}
