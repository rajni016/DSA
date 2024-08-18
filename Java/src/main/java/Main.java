// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class Main {

  public static void removeDuplicatesnewarray(int arr[]){
    
    
    int [] newarray=new int [arr.length] ;
    newarray[0]=arr[0];
    int j=1;

    for(int i=1;i<arr.length;i++){
      if (arr[i]!=arr[i-1]){    
        newarray[j++]=arr[i];
       //  System.out.println(arr[j]);
        
      }   
  }
    
    newarray=Arrays.copyOf(newarray,j);
   for(int element:newarray){
     System.out.print(element);
   }
 
  

}


  public static void removeDuplicates(int arr[]){
    
  }
  public static void main(String[] args) {
    int [] array={1,2,2,5,7,8,9,9,10};
      removeDuplicates(array);

  }
}