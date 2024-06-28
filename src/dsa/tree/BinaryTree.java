package dsa.tree;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left=null;
            right=null;

        }
    }

    static class BinaryBuildTree
    {
        static int idx=-1;
        public static Node buildTree(int node[])
        {
            idx++;
            if(node[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }

    }

    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryBuildTree tree=new BinaryBuildTree();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);

    }
}
