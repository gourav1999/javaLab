import java.util.Scanner;

public class program
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();

        int[][] data = new int[n][n+2];
        System.out.println("First indices " + data.length);
        System.out.println("Second Indices " + data[0].length);

        for(int i=0;i<data.length;i++)
        {
            for(int j=0;j<data[0].length;j++)
            {
                data[i][j] = 1;
            }
        }

        int[][][] datam = new int[n][n+2][n+4];
        System.out.println("First indices" + datam.length );
        System.out.println("Second Indices" + datam[0].length);
        System.out.println("Third indices" + datam[0][0].length);
        for(int i=0;i<data.length;i++)
        {
            for(int j=0;j<datam[0].length;j++)
            {
                for(int k=0;k<datam[0][0].length;k++)
                {
                    datam[i][j][k] = 1;
                }
            }
        }

    }
}