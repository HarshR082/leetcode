class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i!=0){
                if(!list.contains(i)) list.add(i);
            }
        }
        return list.size();
    }
}