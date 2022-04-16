public class diziMaxMin {
    public static void main(String[] args) {
        int[] arr = {56, 34, 1, 8, 101, -2, -33};
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum değer : " + min);
        System.out.println("Maximum değer : " + max);

    }
}
