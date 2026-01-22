class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans=0;
        if(!issort(nums)){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }    
            while(!issortt(list)){
                int minsum = Integer.MAX_VALUE;
                int indx = -1;
                for(int i=0;i<list.size()-1;i++){
                    if((list.get(i)+list.get(i+1))==minsum){
                        continue;
                    }
                    if((list.get(i)+list.get(i+1))<minsum){
                        minsum = list.get(i)+list.get(i+1);
                        indx = i;
                    }
                }
                ans++;
                int a = list.get(indx) + list.get(indx+1);
                list.set(indx,a);
                list.remove(indx+1);
                

            }
            return ans;

        }
        return 0;

    }
    private boolean issort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;

    }
    private boolean issortt(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)) return false;
        }
        return true;

    }
}