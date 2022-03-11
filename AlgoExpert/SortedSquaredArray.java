import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    int[] squaredArray = new int[array.length];

    int smallest=0, biggest=array.length-1;

    for(int i=array.length-1;i>=0;i--){
        
        if(Math.abs(array[smallest])>Math.abs(array[biggest])){
            squaredArray[i]=array[smallest]*array[smallest];
            smallest++;
        }
        else{
            squaredArray[i]=array[biggest]*array[biggest];
            biggest--;
        }
        
    }

    return squaredArray;
  }
}