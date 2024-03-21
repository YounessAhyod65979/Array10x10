public class Array10x10 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];


        int sum = 0;


        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j)
                {
                    matrix[i][j] = i;

                    sum += matrix[i][j];
                }
                else {

                    matrix[i][j] = 0;
                }
            }
        }


        System.out.println("Matrix:");

        for (int[] row : matrix)
        {
            for (int value : row)
            {

                System.out.print(value + " ");
            }

            System.out.println();
        }


        System.out.println("Sum of the diagonal elements is: " + sum);
    }
}
