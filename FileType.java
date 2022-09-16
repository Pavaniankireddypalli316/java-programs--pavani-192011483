import java.util.*;
class helllo<T> {
   T a,b;
   helllo(T a, T b){
      this.a=a;
      this.b=b;
   }
   public void print(){
      System.out.println(a+ " "+b);
   }

}
class subclass extends helllo{

   subclass(int a, int b) {
      super(a, b);
     
   }
   public  void print1(){
   super.print();
   }
}
class FileType<T>{
   public static void main(String[] args){
      Scanner x=new Scanner(System.in);
      try{
      int  a=Integer.parseInt(x.next());
      int b=Integer.parseInt(x.next());
      subclass ob=new  subclass(a,b);
      ob.print1(); 
      }
      catch (Exception e){
        System .out.println("enter the integer data");
      }
   }
}
