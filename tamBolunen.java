import java.util.Scanner;

public class tamBolunen {
    public static void main(String[] args) {
        int a, b=0, c=0, d;

        Scanner input = new Scanner(System.in);

        System.out.print("Bölmek istedidğiniz sayıyı giriniz : ");
        a = input.nextInt();

        for (int i=0;i<=a;i+=12){
            if(i !=0){
               b += i;
               c++;
                System.out.println("Toplam : "+ b);
                System.out.println("Tam bölünenlerin sayısı :"+ c);
            }


        }
        d = b/c;
        System.out.println("Ortalama : " + d);
    }
}
