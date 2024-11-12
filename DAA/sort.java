import java.time.Clock;
public class sort {
  public static int partition_deterministic(int arr[], int low,int  high){
      int pivot=arr[high];
      int i=low-1;
      for(int j=low;j<high;j++){
        if(arr[j]<=pivot){
          i=i+1;
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
      int temp2=arr[i+1];
      arr[i+1]=arr[high];
      arr[high]=temp2;
      return i+1;
  }
  public static void quick_sort_deterministic(int arr[], int low,int  high){
    if(low<high){
     int pi = partition_deterministic(arr, low, high);
     quick_sort_deterministic(arr, low, pi - 1);
     quick_sort_deterministic(arr, pi + 1, high);
    }
 }


  public static void quick_sort_randomized(int arr[], int low,int  high){
     if(low<high){
      int pi = partition_randomized(arr, low, high);
      quick_sort_randomized(arr, low, pi - 1);
      quick_sort_randomized(arr, pi + 1, high);
     }
  }
  public static int partition_randomized(int arr[], int low,int  high){
      int pivot_indx=(int)(Math.random()*high);
      while(pivot_indx < low){
        pivot_indx=(int)(Math.random()*high);
      }
      int temp0 =arr[pivot_indx];
      arr[pivot_indx]=arr[high];
      arr[high]=temp0;
      int pivot=arr[high];
      int i=low-1;
      for(int j=low;j<high;j++){
        if(arr[j]<=pivot){
          i=i+1;
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
      int temp2=arr[i+1];
      arr[i+1]=arr[high];
      arr[high]=temp2;
      return i+1;
  }

  

  public static void display(int arr[]){
      for(int j=0;j<arr.length;j++){
            
        System.out.print(arr[j]+" ");
      }
      System.out.println();
  }

 



  public static void main(String[] args) {
     int sizes[]={100};
     for(int i:sizes){
       int arr[] = new  int[i];
        for(int j=0;j<i;j++){
             arr[j]= (int)(Math.random()*i);
              
        }
        
        // display(arr);
        long stare_time=System.currentTimeMillis();
        System.out.println(stare_time);
        quick_sort_deterministic(arr,0,i-1);
        long end_time=System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("Testing with array of size "+i);
        System.out.println("Array size:"+i);
        System.out.println("Deterministic Quick Sort Time :"+(end_time-stare_time));
        // display(arr);  
        System.out.println();
        // display(arr);
        long stare_time_2=System.currentTimeMillis();
        quick_sort_randomized(arr,0,i-1);
        long end_time_2=System.currentTimeMillis();

        System.out.println("Testing with array of size "+i);
        System.out.println("Array size:"+i);
        System.out.println("Randomized Quick Sort Time :"+(end_time_2-stare_time_2));
        // display(arr);  

        System.out.println(System.nanoTime());


       


     }
  }
}
