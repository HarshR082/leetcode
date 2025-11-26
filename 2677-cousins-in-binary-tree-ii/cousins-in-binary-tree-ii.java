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
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return root;
        ArrayList<Integer> list = new ArrayList<>();
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
        q.add(root);
        int level=1;
        root.val=0;
        while(!q.isEmpty()){
           int n = q.size();
           for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                int sibilingsum = (curr.left!=null ? curr.left.val :0)+(curr.right!=null ? curr.right.val:0);
                if(curr.left!=null){
                    curr.left.val=list.get(level) - sibilingsum;
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    curr.right.val=list.get(level)-sibilingsum;
                    q.add(curr.right);
                }
            }
            ++level;
        }
        return root;
        
    }
}