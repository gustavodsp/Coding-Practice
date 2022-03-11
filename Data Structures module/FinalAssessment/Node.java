//Node with an object of ASubject class as the element

public class Node{
    
    ASubject element;
    Node next;

    public Node(ASubject e, Node n){
        element = e;
        next = n;
    }

    public Node(ASubject e){
        this(e,null);
    }

    public String toString(){
        return ""+element;
    }
    
}