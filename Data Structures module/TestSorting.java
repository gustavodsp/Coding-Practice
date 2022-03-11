public class TestSorting{

    public static void bubbleSort(int[] lista){

        int n = lista.length;
        int temp;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){

                if(lista[j]>lista[j+1]){
                    temp=lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=temp;
                }

            }
        }

    }

    public static void insertionSort(int[] lista){

        int n = lista.length;
        for(int i=1;i<n;i++){

            int value = lista[i];
            int j = i-1;

            while(j>=0 && lista[j]>value){
                lista[j+1]=lista[j];
                j--;
            }

            lista[j+1]=value;

        }
    }
    
    public static void selectionSort(int[] lista){

        int n = lista.length;
        for(int i=0;i<n-1;i++){

            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(lista[j]<lista[minIndex]){
                    minIndex=j;
                }
            }

            int temp = lista[minIndex];
            lista[minIndex]=lista[i];
            lista[i]=temp;

        }

    }

    public static void main(String args[]){

        int[] mylist = {12,6,2,5,4};

        // bubbleSort(mylist);
        // insertionSort(mylist);
        selectionSort(mylist);

        for(int i=0;i<5;i++){
            System.out.println(mylist[i]);
        }

    }
}