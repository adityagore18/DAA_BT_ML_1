public class Knapsack_Dynamic {
   public static void main(String[] args) {
      //Input
      int m=65;
      int n=5;
      int weight[]={0, 8,16,32,40};
      int profit[]={0,50,100,150,200};

     //Logic
      int table[][]=new int[n][m];
      for(int i=1;i<n;i++){
        int w=weight[i];
        int v=profit[i];
        for(int j=1;j<m;j++){
           if(j<w){
            table[i][j]=table[i-1][j];
           }
           else{
            table[i][j]= Math.max(table[i-1][j],v+table[i-1][j-w]);
           }
        }
      }

      System.out.println("After filling table");

      for(int i=0;i<n;i++){
         System.out.print("[ ");
         for(int j=0;j<m;j++){
          System.out.print(table[i][j]+" ,");
         }
         System.out.print("],");
      }


       
      System.out.println("Max Profit : "+table[n-1][m-1]);
       
   }
}
