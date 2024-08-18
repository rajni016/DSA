public class MoveZerosToEndSimpleApproach {

  public static void moveZerosOwn(int [] arr){

    int nonzero=-1;
    int count=0;

    int temp;
    for(int i=0;i<=arr.length-1;i++){
      if(arr[i]!=0){
        temp=arr[i];    
        nonzero++; 
        arr[nonzero]=temp;
      }
      else{
        count++;
      }
    }
     for(int i=0;i<count;i++){

        arr[arr.length-1-i]=0;
     } 

    for(int i=0;i<arr.length;i++){
         System.out.print(" "+arr[i] +" ");
    }

  }

  public static void main(String[] args) {
    int[] arr = {0,0,1,0,5,-1,0};
  //0 1 0 5 -1 ;j=0
  //i=1;j=0 ;1 0 0 5 -1 ;
  //i=2;j=1;1 0 0 5 -1 ;
  //i=3;j=1;1 5 0 0 -1;
  //i=4;j=3;

    moveZerosOwn(arr);
    
  }
}