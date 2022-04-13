import java.util.Scanner;

public class gelismisHesapMakinesi {
    static int toplam(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int cikan(int a, int b) {
        int result = a - b;
        System.out.println("Çıkan : " + result);
        return result;
    }

    static int carpim(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }

    static int bolum(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static int us(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void dikdortgenAlanveCevre(int a, int b) {
        int cevre = 2 * (a + b);
        int alan = a * b;
        System.out.println("Alan : " + alan + "\n" +
                "Çevre : " + cevre);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama işlemi\n" +
                "2- Çıkarma işlemi\n" +
                "3- Çarpma işlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı hesaplama\n" +
                "6- Mod alma\n" +
                "7- Dikdörtgen alan ve çevre hesabı\n" +
                "0- Çıkış yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    toplam(a, b);
                    break;
                case 2:
                    cikan(a, b);
                    break;
                case 3:
                    carpim(a, b);
                    break;
                case 4:
                    if (bolum(a, b) == 0) {
                        System.out.println("İkinci sayı 0 dan farklı bir değer olmalıdır.");
                    }
                    bolum(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + us(a, b));
                    break;
                case 6:
                    System.out.println("Mod Hesabı : " + mod(a, b));
                    break;
                case 7:
                    dikdortgenAlanveCevre(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }
        System.out.println("Güle güle !!");

    }
}
