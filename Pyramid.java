//Java program to build a pyramid of n height
import java.util.*;
class Pyramid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of the Pyramid:");
        int n=sc.nextInt();
        
        //creation of Pyramid
        for(int i=1;i<=n;i++)
        {
            //for starting spaces
            for(int s=n-i;s>0;s--)
            System.out.print(" ");
            //left half of the pyramid
            for(int j=1;j<=i;j++)
            System.out.print("*");
            //right half of the pyramid
            for(int k=i;k>1;k--)
            System.out.print("*");
            //for line change
            System.out.println();
        }
    }
}

/*
------------------------------------OUTPUT-----------------------------------------
Enter the height of the Pyramid:5
    *
   ***
  *****
 *******
*********
   
   
   */
