import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Item{
    int weight;
    int profit;
    float profitByWeight;
    Item(int w,int p,float pw){
      weight=w;
      profit=p;
      profitByWeight=pw;
    }
}


public class pract3 {
  public static  void display(ArrayList<Item> arr){
    System.out.print("[ ");
     for(int i=0;i<arr.size();i++){
        Item it=arr.get(i);
        System.out.print("["+it.weight+","+it.profit+","+it.profitByWeight+"] , ");
     }
    System.out.println("]");
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner( System.in);
      System.out.print("Enter Total No of items :-");
      int n=sc.nextInt();

      ArrayList<Item> arr =new ArrayList<>();
      arr.add(new Item(0,0,0));
      for(int i=1;i<=n;i++){
          System.out.print("\nEnter item "+i+" weight and profit :-");
          int w=sc.nextInt();
          int p=sc.nextInt();
          float pw= (float)p/(float)w;
          Item it =new Item(w,p,pw);
          arr.add(it);
      }

      System.out.print("\nEnter knapsack weight  :-");
      int m=sc.nextInt();
      System.out.println();
      display(arr);
      Collections.sort(  arr , (a,b) -> (int)b.profitByWeight-(int)a.profitByWeight );
      display(arr);
      int i=0;
      float profit=0;
      while(m!=0){
         
        Item obj = arr.get(i);
        int w=obj.weight;
        if(w<=m){
            m=m-w;
            profit=profit+obj.profit;
        }
        else{
          while(w>m){
            w--;
          }
          m=m-w;
          profit= profit + w*obj.profitByWeight;
        }
        i++;
      }

      System.out.println(m);
      System.out.println(profit);

      
  }
}




// int var2 = 15;
// byte var3 = 7;
// int[] var4 = new int[]{10, 5, 15, 7, 6, 18, 3};
// int[] var5 = new int[]{2, 3, 5, 7, 1, 4, 1};
