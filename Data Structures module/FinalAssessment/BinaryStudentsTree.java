public class BinaryStudentsTree<T extends Comparable<T>> implements BinaryTree<T>{

    private BTNode<T> root; //Reference to the root node of the tree

    public BinaryStudentsTree(){
        root=null;
    }

    public boolean isEmpty(){
        return root==null;
    }
    
    public int size(){
        return size(root);
    }

        private int size(BTNode<T> current){ //Method to return the number of students in the tree
            if(current==null){
                return 0;
            }
            else{
                return 1 + size(current.left) + size(current.right);
            }
        }

    public T findMax(){
        if(isEmpty()){
            throw new EmptyTreeException();
        }
        else{
            return findMax(root);
        }
    }

        private T findMax(BTNode<T> current){ //Method to find the maximum element of the tree, in this case the max average student

            if(current.right == null){
                return current.element;     //Self call the method until find the most right value
            }
            else{
                return findMax(current.right);
            }

        }

    public T findMin(){
        if(isEmpty()){
            throw new EmptyTreeException();
        }
        else{
            return findMin(root);
        }
    }

        private T findMin(BTNode<T> current){ //Method to find the minimum element of the tree, in this case the min average student

            if(current.left == null){
                return current.element;     //Self call the method until find the most left value
            }
            else{
                return findMin(current.left);
            }

        }

    public void add(T e){ //Method to add a new node to the tree
        if(isEmpty()){
            root=new BTNode<>(e); //Simple add the new node as the root if the tree is empty
        }
        else{
            insertNode(e,root);
        }
    }

        private void insertNode(T e, BTNode<T> current){
            if(e.compareTo(current.element)<=-1){   //Go to the left side if comparrison is -1
                if(current.left==null){
                    current.left=new BTNode<>(e);   //Put the new node if nothing is in the left side
                }
                else{
                    insertNode(e, current.left);    //Self call method passing the new node in the left to new comparisson
                }
            }
            else{                                   //Go to the right side if comparrison is not -1
                if(current.right==null){
                    current.right=new BTNode<>(e);  //Put the new node if nothing is in the right side
                }
                else{
                    insertNode(e, current.right);   //Self call method passing the new node in the right to new comparisson
                }
            }
        }

    public void printOut(){
        printOut(root);
    }

        private void printOut(BTNode<T> current){ //Method to print out the representation of the tree
            if(current==null){
                return;
            }
            System.out.println(current);
            printOut(current.left);             //Print out all the elements, passing the current one and the left/right
            printOut(current.right);
        }

    public static void main(String args[]){
        
        BinaryStudentsTree<Student> myTree = new BinaryStudentsTree<>();

        LinkedList gustavoGrades = new LinkedList();
        gustavoGrades.add(new ASubject("Math",70));
        gustavoGrades.add(new ASubject("Java",95));     //82 average
        gustavoGrades.add(new ASubject("Ruby",80));
        myTree.add(new Student("Gustavo", 27, 11111, gustavoGrades)); // First element added to root

        LinkedList lucianaGrades = new LinkedList();
        lucianaGrades.add(new ASubject("Math",80));
        lucianaGrades.add(new ASubject("Java",100));     //87 average
        lucianaGrades.add(new ASubject("Ruby",80));
        myTree.add(new Student("Luciana", 29, 22222, lucianaGrades)); //Luciana added to right side of gustavo

        LinkedList barbaraGrades = new LinkedList();
        barbaraGrades.add(new ASubject("Math",90));
        barbaraGrades.add(new ASubject("Java",65));     //77 average
        barbaraGrades.add(new ASubject("Ruby",75));
        myTree.add(new Student("Barbara", 27, 33333, barbaraGrades)); //Barbara added to left side of gustavo

        LinkedList gelcioGrades = new LinkedList();
        gelcioGrades.add(new ASubject("Math",70));
        gelcioGrades.add(new ASubject("Java",55));      //55 average
        gelcioGrades.add(new ASubject("Ruby",40));
        myTree.add(new Student("Gelcio", 30, 44444, gelcioGrades)); //Gelcio added to left side of barbara

        LinkedList loyanneGrades = new LinkedList();
        loyanneGrades.add(new ASubject("Math",95));
        loyanneGrades.add(new ASubject("Java",65));     //74 average
        loyanneGrades.add(new ASubject("Ruby",60));
        myTree.add(new Student("Loyanne", 22, 55555, loyanneGrades)); //Loyanne added to right side of gelcio

        myTree.printOut(); //Demonstration of the add methods printing out the students inside the tree

        System.out.println("The tree size: "+myTree.size()); // Number of students registered
        System.out.println("Max average student grade: "+myTree.findMax()); //Maximum average student
        System.out.println("Min average student grade: "+myTree.findMin()); //Minimum average student

    }

}