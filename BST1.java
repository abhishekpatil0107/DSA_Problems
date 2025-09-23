import java.util.ArrayList;
import java.util.*;

public class BST1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) { // O(H) H=height
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else {
            // root.data=val
            // Case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (X <= root.data && Y >= root.data) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (X >= root.data) {
            printInRange(root.right, X, Y);
        } else {
            printInRange(root.left, X, Y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // Leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else { // non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 13, 3, 8, 15, 4, 10, 2 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (search(root, 3)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        delete(root, 10);
        inOrder(root);
        System.out.println();

        printInRange(root, 3, 8);
        printRoot2Leaf(root, new ArrayList<>());
    }

}
