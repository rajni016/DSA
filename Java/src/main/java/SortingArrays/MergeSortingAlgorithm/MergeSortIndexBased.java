import java.util.List;
import java.util.ArrayList;
public class MergeSortIndexBased{
  public static void mergeSortDivision(int arr[],int low,int high){
    if(low>=high) return;  
    int mid=(low+high)/2;
    mergeSortDivision(arr,low,mid);
    mergeSortDivision(arr,mid+1,high);
    mergeSort(arr,low,mid,high);  
    
  }
  public static void mergeSort(int arr[],int low,int mid,int high){
    int left=low;
    int right=mid+1;
    ArrayList<Integer> temp=new ArrayList<>();
    while(left<=mid &&right<=high){
      if(arr[left]<=arr[right]){
        temp.add(arr[left]);
        left++;
      }
      else{
        temp.add(arr[right]);
        right++;
      }
        
    }
    while(left<=mid){
      temp.add(arr[left]);
      left++;
    }
    while(right<=high){
      temp.add(arr[right]);
      right++;
    }
    for(int i=low;i<=high;i++){
      arr[i]=temp.get(i-low);
    }
   
  } 
  public static void main(String [] args){
    int [] inputArray={1,2,1,1,0,-1,9,4,7,6,3,1,5};
    int n=inputArray.length-1;
    mergeSortDivision(inputArray,0,n);
    for(int i=0;i<=n;i++){
          System.out.print(inputArray[i]);
    }
  }

}