// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class findlargest {


public static void findlargestsort(int arr[]){
  Arrays.sort(arr);
  System.out.println("find largest using sort "+ arr[arr.length-1]);
}

public static void findlargesteachloop(int arr[]){
  int largest =arr[0];
  for(int element:arr){
    if(element>largest){
         largest=element;
    } 
  }
  System.out.println("find largest using for each loop " + largest);
}

  public static void findlargestloop(int arr[]){
    int largest =arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>largest){
           largest=arr[i];
      } 
    }
    System.out.println("find largest for loop " + largest);
  }


  public static void main(String[] args) {
    int [] array={1,0,99,1000,11,12,3,1};
    findlargestsort(array);
    findlargesteachloop(array);
    findlargestloop(array);
  }

}