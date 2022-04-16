public class matrisTranspozu {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}

        };
        int[][] matris2 = new int[3][2];

        int[] matris3 = {1, 2, 3};
        System.out.println("Matris : ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                matris2[i][j] = 0;
                for (int k = 0; k < matris2.length; k++) {
                    matris2[i][j] = matris[j][i];
                }
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
