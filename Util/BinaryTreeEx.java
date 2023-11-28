public class BinaryTreeEx {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
System.out.println("left : "+newNode.left);
            newNode.right=buildTree(nodes);
            System.out.println("right : "+newNode.right);

            return newNode;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}

// public class BinaryTreeEx {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;

//         public Node buildTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public void printTree(Node root, String prefix, boolean isLeft) {
//             if (root != null) {
//                 System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
//                 printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
//                 printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         // Print the tree structure
//         tree.printTree(root, "", false);
//     }
// }
