  import java.util.Scanner;
public class Valid
{
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the user name:");
	 String a=s.nextLine();
	 System.out.println("Reenter the user name:");
	 String b=s.nextLine();
	 if(a.equals(b))
	 {
	     System.out.println("User name is Valid");
	 }
	 else{
	     System.out.println("User name is Invalid");
	 }
	}
}