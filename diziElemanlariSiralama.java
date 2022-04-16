import java.util.Arrays;
import java.util.Scanner;

public class diziElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizideki eleman sayısını giriniz : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = 1 + i;
            System.out.print(sum + ". Elemanı : ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
