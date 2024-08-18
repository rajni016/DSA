// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class findsecondSmallest {

  public static void findsecondsmallest(int arr[]){
    if(arr.length<2){
    return;
    }
    int firstSmallest=arr[0];
    int secondSmallest=Integer.MIN_VALUE;

    for(int i=1;i<arr.length;i++){
      if (arr[i]<firstSmallest){
          secondSmallest=firstSmallest;
          firstSmallest=arr[i];

      }
      else if(arr[i]>firstSmallest &&arr[i]<secondSmallest){
          secondSmallest=arr[i];
      }
   }
    System.out.println("first smallest element " + firstSmallest);
    System.out.println("Second smallest element " + secondSmallest);

  }


  public static void main(String[] args) {
    System.out.println("hello world");
    int [] array={22,21,22,3,5,1,12,11,2,0,-1,1,-10};
          findsecondsmallest(array);
  }

}