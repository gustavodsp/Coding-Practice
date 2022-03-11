public class DLList<T>{

    private DLNode<T> first;
    private DLNode<T> last;

    public DLList(){

        first=null;
        last=null;

    }

    public boolean isEmpty(){
        return first==null;
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

    //Add a new element to the end of the linked list
    public void add(T e){
        if(isEmpty()){
            first = new DLNode<T>(e,null,null);
            last=first;
        } 
        else{
            last.next = new DLNode<T>(e,last,null);
            last = last.next;
        }
    }

    public void add(int index, T e){
        if(index<1 || index>size()) throw new IndexOutOfBoundsException();
        
        if(index==1){
            DLNode<T> p = first;
            first = new DLNode<T>(e,null,p);
            if(p!=null){
                p.prev = first;
            }
            if(last==null){
                last=first;
            }
            return;
        }

        DLNode<T> pred = first;
        for(int k=1;k<index-1;k++){
            pred=pred.next;
        }
        DLNode<T> succ = pred.next;
        DLNode<T> middle = new DLNode<T>(e,pred,succ);
        pred.next = middle;
        if(succ == null){
            last = middle;
        }
        else{
            succ.prev = middle;
        }

    }

    public void addAfter(T target, T e){

        boolean success=false;
        DLNode<T> pred = first;
        while(pred!=null){
            if(pred.element==target){

                DLNode<T> succ = pred.next;
                DLNode<T> middle = new DLNode<T>(e,pred,succ);
                pred.next = middle;
                if(succ == null){
                    last = middle;
                }
                else{
                    succ.prev = middle;
                }
                success=true;
                
            }
            pred=pred.next;
        }
        if(!success){
            System.out.println("Element not found!");
        }

    }

    void addBefore(T target, T e){

        boolean success=false;
        DLNode<T> succ = first;

        while(succ!=null){

            if(succ.element==target){

                DLNode<T> pred = succ.prev;
                DLNode<T> middle = new DLNode<T>(e, pred, succ);

                if(pred==null){
                    first=middle;
                }
                else{
                    pred.next=middle;
                }

                success=true;
            }

            succ=succ.next;

        }

        if(!success){
            System.out.println("Element not found!");
        }

    }

    public String toString(){
        
        DLNode<T> p = first;
        String nodes="";
        for(int i=0;i<size();i++){
            if(nodes.equalsIgnoreCase("")){
                nodes="<"+p.toString();
            }
            else{
                nodes=nodes+", "+p.toString();
            }
            if(i==size()-1){
                nodes=nodes+">";
            }
            p=p.next;
        }
        return nodes;
    }

    public T get(int index){

        DLNode<T> p = first;
        T element;

        for(int i=1;i<index;i++){
            p=p.next;
        }
        element = p.element;

        return element;

    }

    public void prepend(T e){

        DLNode<T> next = first;
        first = new DLNode<T>(e,null,next);
        if(next!=null){
            next.prev = first;
        }
        if(last==null){
            last=first;
        }

    }

    public void remove(T target){

        DLNode<T> myNode = first;
        boolean success=false;

        while(myNode!=null){

            if(myNode.element==target){

                if(myNode.prev!=null){

                    if(myNode.next!=null){
                        myNode.prev.next = myNode.next;
                        myNode.next.prev = myNode.prev;
                    }
                    else{
                        myNode.prev.next = null;
                        last = myNode.prev;
                    }
                    
                }
                else{

                    if(myNode.next!=null){
                        myNode.next.prev = null;
                        first = myNode.next;
                    }
                    else{
                        last=null;
                        first=null;
                    }

                }
                
                success=true;
                return;
            }
            myNode=myNode.next;
        }
        if(!success){
            System.out.println("Element not found!");
        }
    }

    public static void main(String args[]){

        DLList<Integer> myList = new DLList<>();

        myList.add(1);
        myList.add(3);
        myList.add(5);
        System.out.println(myList);

        myList.prepend(9);
        System.out.println(myList);       

        System.out.println(myList.get(6));

        myList.add(3,9);
        System.out.println(myList);

        myList.remove(3);
        System.out.println(myList);

        myList.addAfter(9, 10);
        System.out.println(myList);

        myList.addBefore(10, 3);
        System.out.println(myList);

        System.out.println("First element - "+myList.first);
        System.out.println("Last element - "+myList.last);
        System.out.println("List size - "+myList.size());

    }
    
}