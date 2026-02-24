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
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        store(root,0,list);
        int sum=0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }
    private void store(TreeNode root,int currval,List<Integer> list){
        if(root==null) return ;
        currval=currval*2+root.val;
        if(root.left==null && root.right==null){
            list.add(currval);
            return;
        }
        store(root.left,currval,list);
        store(root.right,currval,list);
    }
}