public class sort{
  public static void SelectionSort(int [] arr){
  int n=arr.length;
    //n-2 - we need to sort last element it is already sorted
    for(int i=0;i<=n-2;i++){
      int minIndex=i;
      //n-1 --min value should check till end of array
      for(int j=i;j<=n-1;j++){
        if(arr[j]<arr[minIndex]){
          minIndex=j;
        }
      }
      int swap=arr[i];
      arr[i]=arr[minIndex];
      arr[minIndex]=swap;
    }
  }

  public static void main(String [] args){
    int [] arr={1,2,1,3,4,2,1,0,-1};
    SelectionSort(arr);
    for(int element: arr){
      System.out.println(element);
    }
  }
}