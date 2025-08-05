import java.util.*;

public class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

        }

    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;

    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heightNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightNodes(root.left);
        int rightHeight = heightNodes(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    public static int diamneter(Node root) {
        if (root == null) {
            return 0;
        }

        int diaLeft = diamneter(root.left);
        int diaRight = diamneter(root.right);
        int diaMax = heightNodes(root.left) + heightNodes(root.right) + 1;

        return Math.max(diaMax, Math.max(diaRight, diaLeft));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root " + root.data);
        System.out.print("Preorder:- ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder:- ");
        inOrder(root);
        System.out.println();
        System.out.print("Postorder:- ");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder:- ");
        levelOrder(root);
        System.out.println("Count of Nodes:- ");
        System.out.println(countNodes(root));
        System.out.println("Height of Nodes:- ");
        System.out.println(heightNodes(root));
        System.out.println();
        System.out.println("Diameter:- ");
        System.out.println(diamneter(root));
        System.out.println();
        System.out.println("Diameter 2:- ");
        System.out.println(diameter2(root).diam);

    }

}
