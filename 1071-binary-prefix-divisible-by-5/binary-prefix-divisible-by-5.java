class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> list = new ArrayList<>();
        int pre = 0;
        for(int i:nums){
            pre = (pre*2+i)%5;
            list.add(pre==0);
        
        }
        return list;
    }
}