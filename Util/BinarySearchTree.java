import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }

        if(root.data>value){
            root.left=insert(root.left,value);
        }else if(root.data<value){
            root.right=insert(root.right,value);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data<key){
            return search(root.right, key);
        }
        else if(root.data==key){
            return true;
        }
        return false;
    }

    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
            //case 1
            if(root.left==null && root.right ==null){
                return null;
            }

            //case 2
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //case 3
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
             while(root.left!=null){
                root=root.left;
             }
             return root;
    }

    public static void printInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data <=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }else{
            printInRange(root.right, X, Y);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        int k=0;
        for(int i=0;i<path.size()-1;i++){
            System.out.print(path.get(i)+"->");
            k++;
        }
        System.out.print(path.get(k));
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        
        path.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println("The path is :");
            printPath(path);
        }else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 1)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }

        System.out.println();
        delete(root, 10);
        inorder(root);
System.out.println();
        printInRange(root, 6, 11);

        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
    }
}
