//Pushes maximum element in the array with adjacent swaps(checks if adjacent element is greater or not, as in ascending order the adjacent element will be greater)
//printing in descending order

public class BubbleSort{
  public static void bubbleSort(int []arr){
     int n=arr.length-1;
    //Taking the elements from last index
    for (int i=0;i<=n;i++){
      boolean swapped=false;
      //to avoid checking the first element with negative index taking i-1
      for(int j=0;j<n-i;j++){
        if(arr[j]<arr[j+1]){
          int swap= arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=swap;
          swapped=true;
        }
      }
      if(!swapped){
        break;
      }
    }
  }
  public static void main(String [] args){
    int [] arr={-1,0,1,2,3,4,5,6,7,8,9,10};
    bubbleSort(arr);
      for(int element: arr){
      System.out.println(element);
      }
  }
}