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
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }
    
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        dfs(root.right);
        list.add(root.val);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     LinkedList<Integer> list = new LinkedList();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         Stack<TreeNode> stack = new Stack();
//         if(root == null){
//             return list;
//         }
//         stack.add(root);
//         while(!stack.isEmpty()){
//             TreeNode node = stack.pop();
//             if(node.left != null){
//                 stack.add(node.left);
//             }
//             if(node.right != null){
//                 stack.add(node.right);
//             }
//             list.addFirst(node.val);
//         }
//         return list;
//     }    
// }