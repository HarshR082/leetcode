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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levellist = new ArrayList<>();
        if (root == null) return levellist;
        else{
            ArrayList<Integer> list = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                TreeNode n = q.remove();
                if(n==null){
                    levellist.add(list);
                    if(q.isEmpty()) break;
                    list=new ArrayList<>();
                    q.add(null);
                }else{
                    list.add(n.val);
                    if(n.left!=null) q.add(n.left);
                    if(n.right!=null) q.add(n.right);
                }
            }
        return levellist;
        }  
    }
}