public class IntegerBST extends BinarySearchTree<Integer> {

    private BTNode<T> root;

    public IntegerBST(){
        root=null;
    }

    public int sum(){
        return sum(root);
    }

        private int sum(BTNode<Integer> current){
            if(current.left==null && current.right==null){
                return current.element;
            }
            else if(current.left==null && current.right!=null){
                return current.element+sum(current.right);
            }
            else if(current.left!=null) && current.right==null){
                return current.element+sum(current.left);
            }
            else{
                return current.element+sum(current.right)+sum(current.left);
            }
        }

    public int product(){
        return product(root);
    }

        private int product(BTNode<Integer> current){
            
        }

}