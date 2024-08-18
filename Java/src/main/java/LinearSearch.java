public class LinearSearch{
  public static int linearSearch(int [] arr, int k){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==k){
        System.out.println(i);
        return i;
      }
    
    }
     return -1;
    
  }
  public static void main(String [] args){
    int [] arr={1,4,5,2,3};
      linearSearch(arr,0);
  }  
}