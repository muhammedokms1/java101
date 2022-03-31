import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int tarih;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihinizi giriniz :");
        tarih = input.nextInt();
        if(tarih<0){
            System.out.println("Geçerli bir tarih giriniz!");
        }
        if (tarih%12==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if (tarih%12==1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (tarih%12==2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (tarih%12==3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if (tarih%12==4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if (tarih%12==5){
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        if (tarih%12==6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if (tarih%12==7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if (tarih%12==8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        if (tarih%12==9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if (tarih%12==10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if (tarih%12==11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
