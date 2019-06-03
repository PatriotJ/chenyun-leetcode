/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList();
    public int kthSmallest(TreeNode root,int k){
        LinkedList<TreeNode>stack = new LinkedList();
        while(true){
            while(root!=null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pollLast();
            if(--k ==0)return root.val;
            root = root.right;
        }
    }
//     public int kthSmallest(TreeNode root, int k) {
//         dfs(root);
//         return list.get(k-1);
//     }
    
//     public void dfs(TreeNode root){
//         if(root == null){
//             return;
//         }
//         dfs(root.left);
//         list.add(root.val);
//         dfs(root.right);
//     }
}