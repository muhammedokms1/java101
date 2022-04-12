public class palindromSayi {
    static void isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println(number + " bu sayı bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bu sayı bir palindrom sayı değildir.");
        }
    }


    public static void main(String[] args) {
        isPalindrom(515);
    }
}
