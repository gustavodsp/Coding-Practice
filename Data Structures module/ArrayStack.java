public class ArrayStack<T>{

    private int maxSize;
    private int top;
    private T[]items;

    public ArrayStack(int size){

        this.maxSize=size;
        this.top=-1;
        this.items=(T[]) new Object[maxSize];

    }

    public void push(T elem){
        if(top == maxSize){
            throw new IndexOutOfBoundsException();
        }
        else{
            top++;
            items[top]=elem;
        }
    }
    
    public T pop(){
        if(top == -1){
            throw new IndexOutOfBoundsException();
        }
        else{
            T elem = items[top];
            top--;
            return elem;
        }
    }

    public String toString(){
        String str = "TOP";
        int counter = top;
        while(counter>=0){
            str+="\n"+items[counter];
            counter--;
        }
        return str+"\nBOTTOM";
    }

    public static void main(String args[]){

        ArrayStack<Integer> myStack = new ArrayStack<>(3);
        myStack.push(0);
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack);
        int loy = myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.push(500);
        System.out.println(myStack);
        System.out.println(loy);    

    }
}