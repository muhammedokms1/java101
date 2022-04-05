import java.util.Scanner;

public class basSayiToplami {
    public static void main(String[] args) {
        //Ödev
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int basValue;
        int toplam=0;
        int a;
        while(number != 0){
            basValue = number%10;
            toplam = basValue+ toplam;
            number/=10;
        }
        System.out.println("Rakamların toplamı : "+ toplam);



    }


}
