public class DLNode<T>{

    T element;
    DLNode<T> next;
    DLNode<T> prev;
    

    public DLNode(T el, DLNode<T> p, DLNode<T> n){
        element = el;
        prev = p;
        next = n;
    }

    public DLNode(T el){
        this(el, null, null);
    }

    public String toString(){
        return ""+element;
    }

    public static void main(String args[]){

        DLNode<Integer> node = new DLNode<>(100);
        node.next = new DLNode<>(1001, node, null);
        
        System.out.println(node);
        System.out.println(node.next);

    }

}

