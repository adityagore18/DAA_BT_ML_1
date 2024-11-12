import java.util.Scanner;

public class Pract1 {
  public static void printFibseries(int n){
     int f1=0;
     int f2=1;
     int f3;
     System.out.print(f1+" "+f2+" ");
     for(int i=0;i<n-2;i++){
       f3=f1+f2;
       System.out.print(f3+" ");
       f1=f2;
       f2=f3;
     }

  }
  public static int fibNo(int num){
    if(num==0) return 0;
    if(num==1) return 1;
    return fibNo(num-1)+fibNo(num-2);
  }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter fib No :-");
      int n=sc.nextInt();
      System.out.println("Fibnacci upto "+n);
      printFibseries(n);
      System.out.println("\nFibnacci No. at  "+n+":-"+fibNo(n-1));




   }
}
