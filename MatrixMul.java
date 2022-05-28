class MatrixMul
{
    public static void main(String args[])
    {
        int m=3, n=3, i, j,k;                  //Given m is rows and n is columns, i,j,k are to evaluate each index
        int mul[][] = new int[m][n];           //mul stores resultant matrix
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};  //Giving values for matrix a
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};  //Giving values for matrix b
        for (i = 0; i < m; i++)                 //Loop to store the multiplication of each index in resultant matrix sum
            for (j= 0; j < n; j++)
                for(k=0;k<n;k++)                // since both are 3x3 matrix multiplication is possible 
                mul[i][j] += a[i][k] * b[k][j];

        System.out.println("Matrix Multiplication:");
        System.out.println("Multiplication of the a and b matrices:");
        for (i = 0; i < m; i++)                 //Loop to display 2D matrix
        {
            for (j = 0; j < n; j++)
                System.out.print(mul[i][j] + "\t");    //To give required spacing

            System.out.println();
        }
    }
}
