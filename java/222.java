// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     Map<TreeNode,Integer> map = new HashMap();
//     int v = 0;
//     int ans = 0;
//     public int countNodes(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         dfs(root,0);
//         LinkedList<TreeNode> queue = new LinkedList();
//         queue.add(root);
//         while(!queue.isEmpty()){
//             int l = queue.size();
//             while(l > 0){
//                 l--;
//                 TreeNode node = queue.pop();
//                 if(map.get(node) == v++){
//                     ans ++;
//                 }
//                 if(node.left!=null){
//                     queue.add(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.add(node.right);
//                 }
//             }
//         }
//         return ans;
//     }
    
//     public void dfs(TreeNode root,int k){
//         if(root == null){
//             return;
//         }
//         map.put(root,k);
//         dfs(root.left,2*k+1);
//         dfs(root.right,2*k+2);
//     }
    
// }
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
    Map<TreeNode,Integer> map = new HashMap();
    int v = 0;
    int ans = 0;
    public int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int res = 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(left == right){
            res = 1 + (1<<left)-1 + countNodes(root.right);
        }else{
            res = 1 + countNodes(root.left) + ((1 << right) - 1);
        }
        return res;
    }
    
    public int depth(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.left;
        }
        return h;
    }
    
}