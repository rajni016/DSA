public class ReverseArray{

 public static void reverseArray(int arr[]){
  int start=0;
   int end=arr.length-1;
   int swap;
   while(start<end){
     swap=arr[start];
     arr[start]=arr[end];
     arr[end]=swap;
     start++;
     end--;
    
   }

  for (int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      } 
 }

public static  void  revArray(int [] arr){
int n=arr.length/2;
  int swap;
  for (int i =0;i<=n;i++){
     swap=arr[i];
    arr[i]=arr[n-i];
    arr[n-i]=swap;
  }

for (int element: arr){
  System.out.print(element);
}
}


public static void main(String args[]){

    int array []={1,2,3,4,5,6,7,8,10};
    reverseArray(array);
    revArray(array) ; 
  }
}
