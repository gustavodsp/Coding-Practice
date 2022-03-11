import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.

    int check=0;
    for(int i=0;i<array.size();i++){

        if(sequence.get(check)==array.get(i)){

            check++;

        }
        
        if(check==sequence.size()){
            return true;
        }


    }

    

    return false;
  }
}