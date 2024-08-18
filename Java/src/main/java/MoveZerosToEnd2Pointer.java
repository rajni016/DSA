public class MoveZerosToEnd2Pointer {

  public static void moveZerosTwoPointer(int arr[]){
    int j=-1; 
    int temp;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]==0){
          j=i;
          break;
          }
        }
    if(j==-1)
      return ;
    for(int i =j+1;i<arr.length;i++){
      if(arr[i]!=0){
        temp=arr[i];
        arr[j]=temp;
        arr[i]=0;
        // J will be assigned to next zero position
        j++;
      }
    }


    System.out.println("Two pointer Approach");
    for(int i=0;i<arr.length;i++){

         System.out.print(" "+ arr[i] +" ");
    }

  }
  public static void main(String[] args) {
    int[] arr = {0,0,1,0,5,-1,0};
  //0 1 0 5 -1 ;j=0
  //i=1;j=0 ;1 0 0 5 -1 ;
  //i=2;j=1;1 0 0 5 -1 ;
  //i=3;j=1;1 5 0 0 -1;
  //i=4;j=3;
    moveZerosTwoPointer(arr);
  }
}