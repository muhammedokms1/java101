import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        int total = 0;

        for(int i=1;i<number;i++){
            if(number % i == 0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("Mükemmel Sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
