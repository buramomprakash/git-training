package assignment2;
import java.util.Scanner;
public class assignment2
{
 
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        b = sc.nextInt();
        System.out.println("Enter the 3rd number:");
        c = sc.nextInt();
        if(a>b && a>c)
       {
            System.out.println("Largest number is:"+a);
        }
        else if(b>c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
    }
 
}