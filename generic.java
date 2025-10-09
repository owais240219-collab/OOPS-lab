import java.util.*;

class TreeNode<T extends Comparable<T>> {
    T data;
    TreeNode<T> left, right;

    TreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    private TreeNode<T> insertRec(TreeNode<T> root, T data) {
        if (root == null) {
            root = new TreeNode<>(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode<T> node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(TreeNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode<T> node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void levelOrder() {
        if (root == null) return;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            System.out.print(node.data + " ");

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Print name and ID
        System.out.println("Owais Mohammed Khan");
        System.out.println("2117240070219\n");

        // Create tree and run test cases
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);

        System.out.print("Level Order: ");
        tree.levelOrder();

        System.out.print("In-order: ");
        tree.inOrder();

        System.out.print("Pre-order: ");
        tree.preOrder();

        System.out.print("Post-order: ");
        tree.postOrder();
    }
}
