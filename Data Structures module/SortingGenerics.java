public class SortingGenerics {

    public static <T extends Comparable<T>> void insertionSort(T[] lista){

        int n = lista.length;
        for(int i=1;i<n;i++){

            T value = lista[i];
            int j = i-1;

            while(j>=0 && lista[j].compareTo(value)>=1){
                lista[j+1]=lista[j];
                j--;
            }

            lista[j+1]=value;

        }

    }
    
    public static void main(String args[]){

        // String[] mylist = {"Loyanne", "Luciana", "Barbara"};
        // Integer[] mylist = {12,2,4,6,5};
        Student[] students = new Student[] {new Student("Ben", 5), new Student("Jack", 1), new Student("Gerry", 2)};

        // insertionSort(mylist);
        insertionSort(students);

        // for(int i=0;i<mylist.length;i++){
        //     System.out.println(mylist[i]);
        // }

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }

    }

}