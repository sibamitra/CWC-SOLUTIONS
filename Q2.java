
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int m, n, i, j ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        n = sc.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                array[i][j] = sc.nextInt();
        System.out.println("Enter Choice 1 or 2 :");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                for (int l = 0; l < array.length; l++) {
                    for (int p= 0; p < array[l].length; p++) {
                        for (int k = 0; k < array[l].length - p - 1; k++) {
                            if (array[l][k] > array[l][k + 1])
                            {
                                int t = array[l][k];
                                array[l][k] = array[l][k + 1];
                                array[l][k + 1] = t;
                            }
                        }
                    }
                }
                for (int s = 0; s < array.length; s++) {
                    for (int d = 0; d < array[s].length; d++)
                        System.out.print(array[s][d] + " ");
                    System.out.println();
                }
                break;


            case 2:
                for (int l = 0; l < array.length; l++) {
                    for (int p= 0; p < array[l].length; p++) {
                        for (int k = 0; k < array[l].length - p - 1; k++) {
                            if (array[l][k] < array[l][k + 1])
                            {
                                int t = array[l][k];
                                array[l][k] = array[l][k + 1];
                                array[l][k + 1] = t;
                            }
                        }
                    }
                }
                for (int s = 0; s < array.length; s++) {
                    for (int d = 0; d < array[s].length; d++)
                        System.out.print(array[s][d] + " ");
                    System.out.println();
                }

        }

    }
}
