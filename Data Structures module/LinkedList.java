public class LinkedList<T> {

    Node<T> first, last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (last == null);
    }

    public int size() {
        int s = 0;
        Node<T> node = first;
        while (node != null) {
            s++; // s=s+1;
            node = node.next;
        }
        return s;
    }

    public void add(T e) {

        if (isEmpty()) {
            this.first = new Node(e);
            this.last = this.first;
        } else {
            this.last.next = new Node<T>(e);
            this.last = this.last.next;

        }
    }

    public T get(int index) {
        Node<T> node = this.first;

        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node.element;
    }

    public void prepend(T e) {
        this.first = new Node(e, this.first);
    }

    public void add(int index, T e) {
        if (isEmpty()) {
            this.first = new Node(e);
            this.last = this.first;
        } else if (index == 1) {
            Node<T> n = new Node(e, this.first);
            this.first = n;
        } else if (index > size()) {
            System.out.println("You entered an index greater than the List size. The element was added at the end of the list");
            add(e);
        } else {
            Node<T> node = this.first;
            for (int i = 1; i < index - 1; i++) {
                node = node.next;
            }
            node.next = new Node(e, node.next);
        }
    }

    public void addAfter(T target, T elem) {
        Node<T> node = this.first;
        for (int i = 1; i <= size(); i++) {
            if (node.element == target) {
                node.next = new Node(elem, node.next);
                if (i == size() - 1) {
                    this.last = node.next;
                }

            }
            node = node.next;
        }
    }

    public T remove(T target) {

        Node<T> node = this.first;
        int c = 1;

        if (this.first.element == target) {
            this.first = first.next;
        } else {
            while (node.next.element != target) {
                c++;
                node = node.next;
            }
            if (c == size() - 1){
                this.last = node;
                this.last.next = null;
            }
            else {
               node.next = node.next.next;
            }
          }
        
        return target;

    }
 
       

    
    public String toString() {

        String str = "";
        Node<T> node = this.first;

        for (int i = 1; i <= size(); i++) {
            str += " " + node.element;
            node = node.next;
        }

        return str;
    }

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList();
        myList.add(50);
        myList.add(10);
        myList.add(2);
        myList.add(10);
        myList.addAfter(10, 3);
        myList.add(8);
        myList.add(5);
        System.out.println("Size = " + myList.size());
        System.out.println(myList.toString());
        myList.remove(8);
        System.out.println("First " + myList.first.toString());
        System.out.println("Last = " + myList.last.toString());
        System.out.println("Size = " + myList.size());
        System.out.println(myList.toString());
    }

}
