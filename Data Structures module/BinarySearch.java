public class BinarySearch{

    public static int mySearch (int[] lista, int value, int min, int max){

        int high = max;
        int low = min;
        int mid=Math.floorDiv((min+max),2);

        if(max-min>=0){
            if(lista[mid]>value){
                high=mid-1;
                return mySearch(lista, value, low, high);
            }
            else if(lista[mid]<value){
                low=mid+1;
                return mySearch(lista, value, low, high);
            }
            else{
                return mid;
            }
        }
        else{
            return -1;
        }
    }
    
    public static void main(String args[]){

        int[] mylist = {2,3,4,5,6,7,12,23};

        position = mySearch(mylist,4,0,mylist.length-1);
        if(position==-1){
            System.out.println("Value not found");
        }
        else{
            System.out.println("I find '4' on index: "+position);
        }

    }
}
