import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.

    Arrays.sort(coins);
    int sum=0;

    if(coins.length==1 && coins[0]!=1){
        return 1;
    }

    for(int i=0;i<coins.length;i++){

        sum=sum+coins[i];

        if(coins.length-1==i){
            return sum+1;
        }

        else if(sum<coins[i+1]-1){
            return sum+1;
        }

    }

    return sum+1;
  }
}