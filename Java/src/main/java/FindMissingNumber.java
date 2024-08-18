public class FindMissingNumber{
  public static void findMissingNumber(int [] arr ){
    for(int i=0;i<arr.length;i++){  
      if(arr[i+1]!=arr[i]+1){
        System.out.println(arr[i]+1);
        break;
      }
      
    }
  }
  ////Finding by sum
  public static void findMissingNumberBySum(int arr [] ){
   int  n=arr.length+1;
   int arrSum=arr[0];
    int totSum=n*(n+1)/2;
   
    for(int i=1;i<arr.length;i++){
    arrSum=arrSum+arr[i]; 
    }
    
    int missingNum=totSum-arrSum;
    //int missing=n-k
    
      System.out.println(missingNum);
  }
  public static void main(String [] args){
    int [] arr={1,2,3,4,5,6,7,8,9,10,11,13};
  findMissingNumber(arr);
    findMissingNumberBySum(arr);
  }
}