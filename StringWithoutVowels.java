import java.util.Scanner;
public class StringWithoutVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int x=s1.length();
          int i;
          for(i=0;i<x;i++)
          {
            if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')||(s1.charAt(i)=='A')||(s1.charAt(i)=='E')||(s1.charAt(i)=='I')||(s1.charAt(i)=='U'))
            {
                s1=s1.substring(0, i)+" "+s1.substring(i+1);
            }
          }
        System.out.println("The result is:"+s1);
    }
    
}