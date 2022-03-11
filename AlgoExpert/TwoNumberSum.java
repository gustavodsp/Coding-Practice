import java.util.Arrays;

class Program {

  public static int[] twoNumberSum1(int[] array, int targetSum) {
    // Write your code here.

	for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
                        
                if(array[i]+array[j]==targetSum){

                    int[] result = {array[i], array[j]};
                    return result;

                }
                        
        }
    }
    
    return new int[0];
  }

  public static int[] twoNumberSum2(int[] array, int targetSum) {
    // Write your code here.

	for(int i=0;i<array.length;i++){

        int y = targetSum-array[i];
        if(Arrays.stream(array).anyMatch(x -> x == y)){
            int[] result = {array[i], y};
            return result;
        }
    
    }
    
    return new int[0];
  }

}