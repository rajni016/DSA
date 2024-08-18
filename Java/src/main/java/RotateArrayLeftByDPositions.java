public class RotateArrayLeftByDPositions{
 
  public static void  rotateArray(int []arr,int d){
   d=d%arr.length;
  int  n=arr.length-1;
    //reversing whole array
  reversearray(arr,0,arr.length-1);
    //reversing first part of array ignoring d positions
  reversearray(arr,0,n-d);
    // reversing second part of array d postions
 reversearray(arr,arr.length-d,n);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }
  }

  public static void reversearray(int[]arr,int start, int end){
         int swap;
       while(start<end){
           swap=arr[start];
           arr[start]=arr[end];
           arr[end]=swap;
           start++;
           end--;
       }
   

  }


   public static void  rotateArrayAlphabets(String []arr,int d){
     d=d%arr.length;
    int  n=arr.length-1;
      //reversing whole array
      reversearrayAlphabets(arr,0,n);
      //reversing first part of array ignoring d positions
      reversearrayAlphabets(arr,0,n-d);
      // reversing second part of array d postions
     reversearrayAlphabets(arr,arr.length-d,n);
     
     for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]);
     }
  
    }

    public static void reversearrayAlphabets(String[]arr,int start, int end){
           String swap;
         while(start<end){
             swap=arr[start];
             arr[start]=arr[end];
             arr[end]=swap;
             start++;
             end--;
         }
    
    
    }

  


   public static void main(String []args){
     int [] arr={1,2,3,4,5,6,7,8,9,10};
     String [] alp={"karthik","car","bike"};
      rotateArray(arr,11);
     rotateArrayAlphabets(alp,4);
  

   }
  
}
