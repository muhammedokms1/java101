import java.util.Scanner;

public class deseneGoreMetot {
        static int metot(int number){
            int tempNumb = number;
            while(number > 0){
                number -= 5;
                System.out.println(number);
                if(number == 0 || number < 0){
                    for(int i = number; i <= tempNumb;){
                        i += 5;
                        if(i +5 == tempNumb){
                            break;
                        }
                        System.out.println(i);
                    }

                }
            }
            return tempNumb;
        }
        public static void main(String[] args) {
            int n;
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir sayı giriniz:");
            n = input.nextInt();
            System.out.println(n);
            System.out.print(metot(n));
        }
    }
