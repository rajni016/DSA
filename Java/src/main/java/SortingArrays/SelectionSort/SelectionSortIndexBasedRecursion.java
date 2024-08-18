public class SelectionSortIndexBased{
  public static void selectionSort(int [] arr,int low, int high){
    if(low>=high)
      return;

    int minIndex=low;
    for(int i=low;i<=high;i++){
      if(arr[i]<=arr[minIndex] ){
        minIndex=i; 
      } 
    }
    int swap=arr[low];
      arr[low]=arr[minIndex];
      arr[minIndex]=swap;
 
    selectionSort(arr,low+1,high);
    
  
  }
  public static void main(String [] args){
   int []arr={2,13,12,11,1,0,0,9,10,-1,-1};
    selectionSort(arr,0,arr.length-1);
    for(int element:arr){
      System.out.println(element);
    }
  }
}