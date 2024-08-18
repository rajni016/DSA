// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class findIfArrayisSorted {

  public static boolean findIfArraySorted(int arr[]){

    for(int i=1;i<arr.length;i++){
      if (arr[i]>=arr[i-1]){
       // System.out.println(arr[i]);
       // System.out.println(arr[i-1]);
       // System.out.println("true");

      }   
      else{

        System.out.println("false");
        return false;
      }
  }
    System.out.println("true");
   return true;
}
  public static void main(String[] args) {
    int [] array={1,2,2,5,7,8,1};
      findIfArraySorted(array);

  }
}