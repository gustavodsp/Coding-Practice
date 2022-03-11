public class LLStack<T>{

    private Node<T> first;
    private Node<T> last;

    public LLStack(){
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        int counter = 0;
        Node<T> node = first;
        while (node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    public void push(T e){

        if(isEmpty()) {
            first = new Node<T>(e);
            last = first;
        } else {
            last.next = new Node<T>(e);
            last = last.next;

        }

    }

    public T pop(){

        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        else{

            T element = last.element;

            Node<T> newLast = first;
            for(int i=0;i<size()-2;i++){
                newLast=newLast.next;
            }
            last = newLast;
            last.next=null;

            return element;

        }

    }

    public String toString(){
        String str = "BOTTOM";
        Node<T> node = first;
        while(node!=null){
            str+="-"+node.element;
            node=node.next;
        }
        return str+"-TOP";
    }

    public static void main(String args[]){

        LLStack<Integer> myStack = new LLStack<>();

        myStack.push(1);
        myStack.push(5);
        myStack.push(9);
        System.out.println(myStack);
        System.out.println("Size - "+myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.push(17);
        System.out.println(myStack);

    }

}