import java.util.Scanner;

public class kuvvetCiktisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        System.out.println("-------------------------------");
        System.out.println("4'ün Katları : ");
        for (int i=1;i<=sayi;i*=4){

            System.out.println(i);
        }
        System.out.println("-------------------------------");
        System.out.println("5'in Katları :");
        for (int i=1;i<=sayi;i*=5){

            System.out.println(i);
        }
        System.out.println("-------------------------------");


        }


    }
