import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int day,month;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay(1-12 arası değer giriniz) : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün(1-30 arası değer giriniz) : ");
        day = input.nextInt();


        if(month == 3 ){
            if (day>=21){
                System.out.println("Burcunuz Koçtur!");

            }else {
                System.out.println("Burcunuz Balıktır!");
            }
        }
        if (month == 4){
            if (day>=21){
                System.out.println("Burcunuz Boğadır!");
            }else{
                System.out.println("Burcunuz Koçtur!");
            }
        }
        if (month == 5){
            if (day>=22){
                System.out.println("Burcunuz İkizlerdir!");
            }else{
                System.out.println("Burcunuz Boğadır!");
            }
        }
        if (month == 6){
            if (day>=23){
                System.out.println("Burcunuz Yengeçtir!");
            }else{
                System.out.println("Burcunuz İkizlerdir!");
            }
        }
        if (month == 7){
            if (day>=23){
                System.out.println("Burcunuz Aslandır!");
            }else{
                System.out.println("Burcunuz Yengeçtir!");
            }
        }
        if (month == 8){
            if (day>=23){
                System.out.println("Burcunuz Başaktır!");
            }else{
                System.out.println("Burcunuz Aslandır!");
            }

        }
        if (month == 9){
            if (day>=21){
                System.out.println("Burcunuz Terazidir!");
            }else{
                System.out.println("Burcunuz Başaktır!");
            }
        }
        if (month == 10){
            if (day>=23){
                System.out.println("Burcunuz Akreptir!");
            }else{
                System.out.println("Burcunuz Terazidir!");
            }
        }
        if (month == 11){
            if (day>=22){
                System.out.println("Burcunuz Yaydır!");
            }else{
                System.out.println("Burcunuz Akreptir!");
            }
        }
        if (month == 12){
            if (day>=22){
                System.out.println("Burcunuz Oğlaktır!");
            }else{
                System.out.println("Burcunuz Yaydır!");
            }
        }
        if (month == 1){
            if (day>=22){
                System.out.println("Burcunuz Kovadır!");
            }else{
                System.out.println("Burcunuz Oğlaktır!");
            }
        }
        if (month == 2){
            if (day>=20){
                System.out.println("Burcunuz Balıktır!");
            }else{
                System.out.println("Burcunuz Kovadır!");
            }
        }
    }
}
