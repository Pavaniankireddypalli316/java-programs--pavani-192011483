import java.util.Scanner;
public class Factors
{
    public static void findFactor(int n)
    {
        int a=0;
        for(int i=1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+"\t");
                a+=1;
            }
        }
        System.out.print("No of factors : "+a);

    }
    public static void main(String[] args)
    {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:: ");
        number = scan.nextInt();
        System.out.print("The factors are:: ");
        findFactor(number);
        scan.close();

    }
}