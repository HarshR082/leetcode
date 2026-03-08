class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(nums));
        int n = list.size();
        if(n==1 && list.contains("1")) return "0";
        if(n==1 && list.contains("0")) return "1";
        int start = (int)Math.pow(2,n-1);
        int end = (int)Math.pow(2,n) -1;

        for(int i=start;i<=end;i++){
            String bin = Integer.toBinaryString(i);
            if(!list.contains(bin)) return bin;
        }

        return"00";
    }
}