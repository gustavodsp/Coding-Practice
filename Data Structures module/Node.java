public class Node<T>{
   // 
    T element;
    Node<T> next;

    public Node(T e, Node<T> n){
        element = e;
        next = n;
    }

    public Node(T e){
        this(e,null);
    }

    public String toString(){
        return ""+element;
    }

    public static void main(String args[]){

        Node<Integer> node = new Node<>(100);
        node.next = new Node<>(1001, null);
        
        System.out.println(node);
        System.out.println(node.next);

    }
    
}