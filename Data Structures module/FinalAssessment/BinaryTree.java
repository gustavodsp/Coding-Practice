public interface BinaryTree<T extends Comparable<T>> {

    /**
     * This method returns true if there are no nodes in the tree otherwise it will be false
     */
    public boolean isEmpty();

    /**
     * This method will add a element into the tree
     */
    public void add(T elem);

    /**
     * returns a count of every node in the tree
     */
    public int size();

    /**
     * This method locates and returns the largest value stored in the tree as defined by it location in the tree
     */
    public T findMax();

    /**
     * This method locates and returns the smallest value stored in the tree as defined by it location in the tree
     */
    public T findMin();

    /**
     * This method prints out a representation of the tree
     */
    public void printOut();

}
