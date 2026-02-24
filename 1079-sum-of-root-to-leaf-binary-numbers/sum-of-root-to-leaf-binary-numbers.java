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
        List<List<Integer>> list = new ArrayList<>();
        store(root,new ArrayList<>(),list);
        int sum=0;
        for(List<Integer> l : list){
            int v =0;
            for(int bit : l){
                v=v*2+bit;
            }
            sum+=v;
        }
        return sum;
    }
    private void store(TreeNode root,List<Integer> list1,List<List<Integer>> list){
        if(root==null) return;
        list1.add(root.val);
        if(root.left==null && root.right==null){
            list.add(new ArrayList<Integer>(list1));
        }else{
            store(root.left,list1,list);
            store(root.right,list1,list);
        }
        list1.remove(list1.size()-1);
    }
}