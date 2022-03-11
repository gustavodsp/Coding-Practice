import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.

    ArrayList<Integer[]> output = new ArrayList<Integer[]>();

    Arrays.sort(array);

    for(int i=0;i<array.length-2;i++){

        for(int j=i+1;j<array.length;j++){

            int y = targetSum-array[i]-array[j];
            if(y>array[j]){
                if(Arrays.stream(array).anyMatch(x -> x == y)){
                    Integer[] result = {array[i], array[j], y};
                    output.add(result);
                }
            }

        }

    }

    return output;
  }
}