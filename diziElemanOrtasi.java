public class diziElemanOrtasi {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 15, 30, 50};

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avarage = sum / arr.length;
        System.out.println(avarage);
    }
}
