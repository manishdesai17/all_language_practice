import java.util.Scanner;

public class pro5 {
    public static void main(String []argv)
    {
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter Row:");
         int row=obj.nextInt();
         System.out.println("Enter Column");
         int col=obj.nextInt();

         int arr[][]=new int[row][col];

         for (int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter"+i+"row value and"+j+"");
            }
         }
    }
}
