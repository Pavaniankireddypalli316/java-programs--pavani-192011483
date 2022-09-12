import java.util.Scanner;
public class MinMax{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of elements in the array");
        int x=s.nextInt();
        int arr[]=new int[x];
        int i,j;
        System.out.println("Enter the elements of array");
        for(i=0;i<x;i++)
        {
          arr[i]=s.nextInt();
        }
        int m=arr[0];
        int n1=arr[0];
        for(i=0;i<x;i++)
        {
            if(arr[i]<m)
            {
              m=arr[i];
            }
        }
        for(i=0;i<x;i++)
        {
            if(n1<arr[i])
            {
              n1=arr[i];
            }
        }
        System.out.println("The minimum element of the array:"+m);
        System.out.println("The Maximum element of the array:"+n1);
        System.out.println("The differe between max and min is="+(n1-m));
        System.out.println("The sum between max and min is="+(m+n1));
    }
}