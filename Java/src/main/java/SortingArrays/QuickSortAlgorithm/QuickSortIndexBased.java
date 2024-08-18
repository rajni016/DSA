public class QuickSortIndexBased{
  public static void quickSortPartition(int [] arr, int low, int high){
    if(low>=high)
      return;
    int partition=quickSort(arr,low,high);
    quickSortPartition(arr, low,  partition-1);
    quickSortPartition(arr, partition+1,high);  
    
  }
  public static int quickSort(int [] arr,int low, int high){
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j){
      //i should  not exceed the entire array length
      while(arr[i]<=pivot&&i<=high-1){
        i++;
      }
      // j shouldnot go below zeroth index
      while(arr[j]>pivot&&j>=low+1){
        j--;
     
      }
      if(i<j){
         int swap=arr[i];
          arr[i]=arr[j];
          arr[j]=swap;
      }
 
    }
    arr[low]=arr[j];
    arr[j]=pivot;
    return j;
  }
  
  public static void main(String [] args){
    int [] arr={4,4,5,9,0,9};
    
    quickSortPartition(arr,0,arr.length-1);
    for(int element:arr){
      System.out.print(element);
    }
  }
}
