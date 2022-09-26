import java.util.*;
import java.util.Scanner;
public class Javaintro4{
    Scanner sc = new Scanner(System.in);

    public static void Colsum(int arr[][])
    {   System.out.println("COLUMN SUM OF 2D ARRAY");
        for(int i=0;i<3;i++)
        {
            int colsum=0;
            for(int j=0;j<3;j++)
            { colsum = colsum + arr[j][i];
            }
            System.out.println(colsum);
        }
    }

    public static void Rowsum(int arr[][])
    {   System.out.println("ROW SUM OF 2D ARRAY");
        for(int i=0;i<3;i++)
        {
            int rowsum=0;
            for(int j=0;j<3;j++)
            { rowsum = rowsum + arr[i][j];
            }
            System.out.println(rowsum);
        }
    }
    public static void main(String[] args)
    {int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
     Javaintro4.Colsum(arr);
     Javaintro4.Rowsum(arr);
}
}