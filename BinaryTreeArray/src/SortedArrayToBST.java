// Java program to print BST in given range

// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {

     Node root;

    /* A function that constructs Balanced Binary Search Tree
    from a sorted array */
    Node sortedArrayToBST(int arr[], int start, int end) {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

		/* Recursively construct the left subtree and make it
		left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

		/* Recursively construct the right subtree and make it
		right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    /* A utility function to print preorder traversal of BST */
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public int height() { return height(root); }
    private int height(Node curr) {
        if (curr == null)
            return 0;
        int hL = height(curr.left);
        int hR = height(curr.right);
        return Math.max(hL, hR) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = new int[]{ 5, 6, 7,8,9,10,11};
        int n = arr.length;
        tree.root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        System.out.println("The high = " + (tree.height()));
        tree.preOrder(tree.root);
    }

}

