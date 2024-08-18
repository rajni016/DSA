import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {
  public static void removeDuplicates(int arr[]){
    List <Integer> list=new ArrayList <> ();
    Set<Integer> set= new HashSet<>();
    for(int i=0;i<arr.length-1;i++){
        set.add(arr[i]);
  
      }
    System.out.print(set);

    }


  public static void main(String [] args){
    int [] arr={1,3,2,1,1,2};
    removeDuplicates(arr);
  }
}