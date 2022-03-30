import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,d,e,f,g,h;

        System.out.print("Toplama için 1'i , Çıkarma için 2'yi, Çarpma için 3'ü, Bölme için 4'ü tuşlayınız :");
        int deger = input.nextInt();
        if (deger ==1){
            System.out.print("Birinci sayıyı giriniz : ");
            a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            b = input.nextInt();
            int toplam = a + b ;
            System.out.println("Toplam = " + toplam );
        }else if(deger ==2){
            System.out.print("Birinci sayıyı giriniz : ");
            c = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            d = input.nextInt();
            int cikan = c - d ;
            System.out.println("Çıkan = " + cikan );

        }else if(deger ==3){
            System.out.print("Birinci sayıyı giriniz : ");
            e = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            f = input.nextInt();
            int carpim = e * f ;
            System.out.println("Çarpım = " + carpim );
        }else if(deger ==4){
            System.out.print("Birinci sayıyı giriniz : ");
            g = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            h = input.nextInt();
            int bolum = g/h ;
            System.out.println("Bölüm = " + bolum );
        }else{
            System.out.println("Geçerli bir değer giriniz.");
        }
    }
}
