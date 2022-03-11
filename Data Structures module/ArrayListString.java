import java.util.*;

public class ArrayListString{

    public static void print( ArrayList<String> arr ){
        for(String current:arr){
            System.out.println( current );
        }
        System.out.println("\n");
    }
    public static void main (String[] args){

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello") ;
        list.add("World") ;        
        list.add("bye") ;
        print(list);

        list.remove(0);
        print(list);

        list.add(1, "Hi");
        print(list);

        list.remove("bye");
        print(list);

        list.set(1,"Oi");
        print(list);

        list.clear();
        print(list);

    }
    
}