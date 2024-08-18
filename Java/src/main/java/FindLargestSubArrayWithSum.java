import java.util.List;
import java.util.ArrayList;
public class FindLargestSubArrayWithSum{
  
  List <Integer>list=new ArrayList<>();
  
  public static void findLargestSubArray(int arr[],int k){
    int sum=0;
    int max=0;
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        sum=sum+arr[j];
        count++;
        if(sum==k){
          if(max<count){
            max=count;
            count=0;
            break;
   
          }
        }
      }
    }
    System.out.println(max);
  }
  public static void main(String [] args){
    int arr[]={1,2,1,4,5};
    findLargestSubArray(arr,6);
  }
}