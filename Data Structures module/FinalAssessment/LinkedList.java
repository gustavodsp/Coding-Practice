import java.lang.Math;

public class LinkedList {

    Node first, last; //Reference to first and last nodes

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() { 
        return (last == null);
    }

    public int size() {
        int s = 0;
        Node node = first;
        while (node != null) {
            s++; // s=s+1;
            node = node.next;
        }
        return s;
    }

    public void add(ASubject e) { //Method to add a node with element of type ASubject at the end of the linked list 

        if (isEmpty()) {
            this.first = new Node(e);
            this.last = this.first;
        } else {
            this.last.next = new Node(e);
            this.last = this.last.next;

        }
    }

    public long getAverage() { //Method to get the average grade of this academic record
        Node node = this.first;
        double total=0;

        for (int i = 1; i <= size(); i++) { //iterating throught the list
            total=total+node.element.grade; //Adding all the grades to a total variable
            node = node.next;
        }

        //Returning the average(total/size) using the method round to get the nearest whole number
        return Math.round(total/size()); 
    }

    public void remove(String target) { //Method to remove a target node from the list using its subject name

        Node node = this.first;
        int c = 1;

        if (this.first.element.subject.equalsIgnoreCase(target)) { //Removing mechanism if target is the first node
            this.first = first.next;
        } else {
            while (!node.next.element.subject.equalsIgnoreCase(target)) { //Checking which index is the target node
                c++;
                node = node.next;
            }
            if (c == size() - 1){ //Removing mechanism if target is the last node
                this.last = node;
                this.last.next = null;
            }
            else { //Removing mechanism if the target is in the middle of the list
               node.next = node.next.next;
            }
        }
        //OBS: Null Pointer Exception if the subject target doesn't exist in this list
    }
    
    public String toString() {

        String str = "";
        Node node = this.first;

        for (int i = 1; i <= size(); i++) {
            str += " " + node.element;
            node = node.next;
        }

        return str;
    }

    //Question 1.b - LinkedList Implementation
    public static void main(String args[]){

        LinkedList academicRecord = new LinkedList();
        
        academicRecord.add(new ASubject("Java",50));
        academicRecord.add(new ASubject("Maths",79));       //Testing the add method
        academicRecord.add(new ASubject("English",40));
        academicRecord.add(new ASubject("History",50));
        System.out.println(academicRecord.toString());      //LinkedList after add methods
        System.out.println("Size = " + academicRecord.size());  //Size return 4        
        System.out.println(academicRecord.getAverage());    //Average return 55
        academicRecord.remove("English");                   //Testing remove method
        System.out.println(academicRecord.toString());      //LinkedList after removing "English" subject

    }
    
}
