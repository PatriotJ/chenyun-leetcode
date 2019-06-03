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
    // Map<Integer ,List<TreeNode>> memo = new HashMap();
    public List<TreeNode> allPossibleFBT(int N) {
        // if(!memo.contains(N)){
            List<TreeNode> tree = new LinkedList();
            if(N == 1){
                tree.add(new TreeNode(0));
            }else if(N % 2 == 1){
                for(int i = 0;i<N;i++){
                    int j = N - 1 - i;
                    for(TreeNode left:allPossibleFBT(i)){
                        for(TreeNode right:allPossibleFBT(j)){
                            TreeNode root = new TreeNode(0);
                            root.left = left;
                            root.right = right;
                            tree.add(root);
                        }
                    }
                }
            }
            return tree;
        }
    
}