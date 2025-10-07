class Solution {
    public boolean search(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        return list.contains(target);
    }
}