class Task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        System.out.println("Using nested loops:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = j;
                    continue;
                }
                
                matrix[i][j] = 0;
            }
        }
        printMatrix(matrix);

        System.out.println("Using just one loop to fill matrix as requested:");
        matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = i;
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
