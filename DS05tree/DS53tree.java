package DS05tree;


// in this how tp print it /*  8,7,12,15,2,5
// Inorder  7,8,12
// Preorder 8,7,12
// Postorder 7,12,8 */
class Node{
    int data;
    Node right;
    Node left;

 Node(int data){
        this.data = data;
        right = null;
        left = null;

        } }



class Binary2{
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
        return root;}

    public void preorder(){
       recprint(root);}

        public void recprint(Node root){
            if(root !=null){

        //  System.out.print(root.data+" ");     // preorder
            recprint(root.left);
        //    System.out.print(root.data+" ");    //inorder
            recprint(root.right);
             System.out.print(root.data+" ");     //postorder
            }

        }



    }     





public class DS53tree {
     public static void main(String[] args) {
        Binary2 tree = new Binary2();
       tree.insert(8);
       tree.insert(7);
       tree.insert(12);
       tree.insert(15);
       tree.insert(2);
       tree.insert(5);
      
       tree.preorder();

} 
}
