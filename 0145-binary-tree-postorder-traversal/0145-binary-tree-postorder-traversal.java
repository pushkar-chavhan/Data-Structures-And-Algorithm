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
    // static void postOrder(TreeNode root,ArrayList<Integer>list){
    //     if(root==null){
    //         return;
    //     }
    //     postOrder(root.left,list);
    //     postOrder(root.right,list);
    //     list.add(root.val);
    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        // ArrayList<Integer>list=new ArrayList<>();
        // postOrder(root,list);
        // return list;



        //Using two stacks
        Stack<TreeNode>st1=new Stack<TreeNode>();
        Stack<TreeNode>st2=new Stack<TreeNode>();
        List<Integer>postorder=new ArrayList<>();
        if(root==null){
            return postorder;
        }
        st1.push(root);//aadhi sgle st1 mdhe add karun takache 
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);//st1 mdhun kadun st2 mdhe add karache
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }
}