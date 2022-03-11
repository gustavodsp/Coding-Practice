public class LLQueue<T>{

    private Node<T> first;
    private Node<T> last;

    public LLQueue(){

        first=null;
        last=null;

    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        int size=0;
        Node<T> node = first;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
    }

    public void enqueue(T e){
        Node<T> node = new Node<T>(e);
        if(isEmpty()){
            first=node;
            last=node;
        }
        else{
            last.next=node;
            last=node;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{

            T elem = first.element;
            first=first.next;
            return elem;
        }
    }

    public String toString(){
        String s = "<";
        Node<T> node = first;
        for(int i=0;i<size();i++){
            s=s+" "+node.element;
            node=node.next;
        }
        s=s+" >";
        return s;
    }

    public static void main(String args[]){

        LLQueue<Integer> myQueue = new LLQueue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        System.out.println(myQueue);
        int barbara = myQueue.dequeue();
        System.out.println(myQueue);

        System.out.println(barbara);

    }
    
}