class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int k:nums){
            list.add(k);
        }
        int n = original;
        while(list.contains(n)){
            n=n*2;
        }
        return n;
    }
}