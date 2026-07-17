package DS05tree;
class Node{
    int data;
    Node right;
    Node left;

 Node(int data){
        this.data = data;
        right = null;
        left = null;

        } }
class Binary{
    Node root;
    public void insert(int data){
        root=recinsert(data,root);
    }
    public Node recinsert(int data,Node root){
        if(root== null){
        root = new Node(data);
       } 
        if(data<root.data){
            root.left = recinsert(data, root.left);
        }
          if(data>root.data){
            root.right = recinsert(data,root.right);
        }
        return root;
    }
}
public class DS51tree {
     public static void main(String[] args) {
        Binary tree = new Binary();
       tree.insert(8);
       tree.insert(7);
       tree.insert(12);


} 
}
