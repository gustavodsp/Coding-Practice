public class ArrayQueue<T>{

    private int maxSize;
    private int top;
    private T[] items;

    public ArrayQueue(int size){

        this.maxSize=size;
        this.top=-1;
        this.items=(T[]) new Object[maxSize];
        
    }

    public void enqueue(T e){

        if(top == maxSize){
            throw new IndexOutOfBoundsException();
        }
        else{
            top++;
            items[top]=e;
        }

    }

    public T dequeue(){
        if(top == -1){
            throw new IndexOutOfBoundsException();
        }
        else if(top==0){

            top--;
            return items[0];

        }
        else{

            T elem = items[0];
            for(int i=0;i<=top;i++){
                items[i]=items[i+1];
            }
            top--;
            return elem;

        }
    }

    public String toString(){
        String str = "FIRST";
        for(int counter = 0;counter<=top;counter++){
            str+="\n"+items[counter];
        }
        return str+"\nLAST";
    }

    public static void main(String args[]){

        ArrayQueue<Integer> myQueue = new ArrayQueue<>(10);

        myQueue.enqueue(5);
        myQueue.enqueue(9);
        myQueue.enqueue(17);
        System.out.println(myQueue);
        myQueue.dequeue();
        System.out.println(myQueue);
        myQueue.enqueue(29);
        System.out.println(myQueue);
        myQueue.dequeue();
        System.out.println(myQueue);

    }

}