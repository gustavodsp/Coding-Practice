public class DLLQueue<T>{

    private DLNode<T> first;
    private DLNode<T> last;

    public DLLQueue(){
        first=null;
        last=null;
    }

    public void enqueue(T e){

        if(isEmpty()){
            first = new DLNode<T>(e,null,null);
            last=first;
        } 
        else{
            last.next = new DLNode<T>(e,last,null);
            last = last.next;
        }

        // DLNode<T> oldLast = last;
        // last = new DLNode<T>(e);
        // if(isEmpty()){
        //     first = last;
        // }
        // else{
        //     oldLast.next = last;
        // }

    }

    public T dequeue(){

        if(first!=null){
            DLNode<T> myNode = first;
            T dElem = first.element;

            if(myNode.next!=null){
                myNode.next.prev = null;
                first = myNode.next;
            }
            else{
                last=null;
                first=null;
            }

            return dElem;

        }
        else{
            throw new EmptyQueueException();
        }

    }

    public boolean isEmpty(){
        return first==null;
    }

    public T peak(){

        if(first!=null){

            return first.element;

        }
        else{
            throw new EmptyQueueException();
        }

    }

    public int size(){
        int count = 0;
        DLNode<T> p = first;
        while(p!=null){
            count++;
            p=p.next;
        }
        return count;
    }

    public static void main (String args[]){

        DLLQueue<Integer> myQueue = new DLLQueue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        System.out.println(myQueue.peak());
        System.out.println("The size of the queue is "+myQueue.size());
        myQueue.dequeue();
        System.out.println(myQueue.peak());

    }

}