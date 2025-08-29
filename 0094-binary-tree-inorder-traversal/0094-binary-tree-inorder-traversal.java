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
    // static void inOrder(TreeNode root,List<Integer>list){
    //     if(root==null){
    //         return;
    //     }
    //     inOrder(root.left,list); 
    //     list.add(root.val);
    //     inOrder(root.right,list);
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer>list=new ArrayList<>();
        // inOrder(root,list);
        // return list;


        //Iterative solutiion

        List<Integer>inorder=new ArrayList<>();
        Stack<TreeNode>st=new Stack<TreeNode>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop();
                inorder.add(node.val);
                node=node.right;
            }
        }
        return inorder;
    }
}