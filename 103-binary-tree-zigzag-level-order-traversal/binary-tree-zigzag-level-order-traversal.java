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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> levsublist=new LinkedList<>();
            while(size>0){
                TreeNode node=queue.poll();
                if(level%2!=0){
                    levsublist.addFirst(node.val);
                }
                else{
                    levsublist.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            level++;
            res.add(levsublist);
        }
        return res;
    }
}