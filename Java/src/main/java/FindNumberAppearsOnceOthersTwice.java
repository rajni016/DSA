public class FindNumberAppearsOnceOthersTwice{
  public static void finNumberAppearingOnce(int arr[]){
    int unique=arr[0];
    int n= arr.length-1;
      if(arr[n]!=arr[n-1]){
         unique=arr[n];
       }
     for(int i=1;i<arr.length-1;i++){
       if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
         unique=arr[i];       
       }

     }
    
    System.out.println(unique);
  }
  public static void main(String [] args){
    int arr[]={-1,-1,1,2,2,3,3,4,4,5,5,6,6,6};
    finNumberAppearingOnce(arr);
  }
  }
