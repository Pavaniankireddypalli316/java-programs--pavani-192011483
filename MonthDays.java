import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Month");
        int n=s.nextInt();
        System.out.println("Enter the year");
        int N=s.nextInt();
        if(n==1)
        {
            System.out.println("January "+N+" has 31 days");
        }
        else if(n==2)
        {
            if(N%4==0)
            {
            System.out.println("February "+N+" has 29 days");
            }
            else
            {
            System.out.println("February "+N+" has 28 days");
            }
        }
        else if(n==3)
        {
            System.out.println("March "+N+" has 31 days");
        }
        else if(n==4)
        {
            System.out.println("April "+N+" has 30 days");
        }
        else if(n==5)
        {
            System.out.println("May "+N+" has 31 days");
        }
        else if(n==6)
        {
            System.out.println("June "+N+" has 30 days");
        }
        else if(n==7)
        {
            System.out.println("July "+N+" has 31 days");
        }
        else if(n==8)
        {
            System.out.println("August "+N+" has 31 days");
        }
        else if(n==9)
        {
            System.out.println("September "+N+" has 30 days");
        }
        else if(n==10)
        {
            System.out.println("October "+N+" has 31 days");
        }
        else if(n==11)
        {
            System.out.println("November "+N+" has 30 days");
        }
        else if(n==12)
        {
            System.out.println("November "+N+" has 31 days");
        }
        else 
        {
            System.out.println("Invalid");
        }
    }
}