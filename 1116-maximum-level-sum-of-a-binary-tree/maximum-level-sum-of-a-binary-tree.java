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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxfind=Integer.MIN_VALUE;
        int ans=0;
        int count=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                list.add(count);
                count=0;
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                }
            }else{
                count+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>maxfind) {
                ans=i+1;
                maxfind=list.get(i);
            }
        }
        return ans;

    }
}