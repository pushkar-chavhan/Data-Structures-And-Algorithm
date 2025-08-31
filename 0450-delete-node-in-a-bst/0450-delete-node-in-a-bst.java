/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base case: if root is null, return null (node not found)
        if(root == null) {
            return root;
        }

        // If key is smaller, go to the left subtree
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } 
        // If key is larger, go to the right subtree
        else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        } 
        // Node with the key is found
        else {
            // Case 1: Node has no left child → replace with right child
            if(root.left == null) {
                return root.right;
            }
            // Case 2: Node has no right child → replace with left child
            else if(root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children
            // → Find inorder successor (smallest node in right subtree)
            TreeNode succ = getSuccessor(root);

            // Replace current node's value with successor's value
            root.val = succ.val;

            // Delete the inorder successor from right subtree
            root.right = deleteNode(root.right, succ.val);
        }

        // Return the (possibly updated) root node
        return root;
    }

    // Helper function to find the inorder successor
    // (minimum value node in right subtree)
    static TreeNode getSuccessor(TreeNode curr) {
        curr = curr.right; // move to right child first
        while(curr != null && curr.left != null) {
            curr = curr.left; // keep going left to find the minimum
        }
        return curr;
    }
}
