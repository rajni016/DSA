import java.util.Arrays;


public class findsecondlargest {

  public static void findSecondLargest(int arr[]){
    if(arr.length<2){
    return;
    }
    int first=arr[0];
    int second=Integer.MIN_VALUE;

    for(int i=1;i<arr.length;i++){
      if (arr[i]>first){
        second=first;
        first=arr[i];

      }
      else if(arr[i]<first &&arr[i]>second){
        second=arr[i];
      }
   }
    System.out.println("first largest element " + first);
    System.out.println("Second largets element " + second);

  }


  public static void main(String[] args) {
  
    int [] array={5,1,2};
      findSecondLargest(array);
  }

}