public class BubbleSort {

public static void bubbleSort(int arr[]) {
  int n = arr.length-1;
  

  // Outer loop for passes
  for (int i = 0; i <= n ; i++) {
    boolean swapped = false;

    // Inner loop for comparing adjacent elements
    for (int j = 0; j < n -i; j++) {
      if (arr[j] <arr[j + 1]) {
        // Swap arr[j] and arr[j + 1]
        int swap = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = swap;
        swapped = true;
      }

    }
    if (!swapped) 
      break;

    // If no two elements were swapped in the inner loop, the array is sorted

    // Print the sorted array

  }
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }

}
//--------------------------------------------------
  public static void ArraysSort(int [] arr){

    int nonzero=-1;
    int count=0;
     System.out.println("countzeav "+nonzero);
    int temp;
    for(int i=0;i<=arr.length-1;i++){
      if(arr[i]!=0){
        temp=arr[i];
        //System.out.println("count of nonzero "+ nonzero);
        nonzero++; 
        System.out.println("count of non zero "+nonzero);
        arr[nonzero]=temp;
      }
      else{
        count++;
      }


    }
    System.out.println("countze "+count);
     for(int i=0;i<count;i++){

      // System.out.println("countzea "+count);
         System.out.println("count of zero "+count);
        arr[arr.length-1-i]=0;
     } 



  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,1,0};
  //  length=5
  //  length-1=4;
  //  count=2

    bubbleSort(arr);
   // ArraysSort(arr);

    for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
    }
  }
}


