class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] cop = Arrays.copyOf(score,score.length);
        Arrays.sort(cop);
        int cc = 1;
        for(int i=cop.length-1;i>=0;i--){
            int j = cop[i];
            for(int k=0;k<score.length;k++){
                if(score[k]==j){
                    if(cc==1){
                        ans[k]="Gold Medal";
                        cc++;
                        break;
                    }if(cc==2){
                        ans[k]="Silver Medal";
                        cc++;
                        break;
                    }if(cc==3){
                        ans[k]="Bronze Medal";
                        cc++;
                        break;
                    }if(cc>3){
                        ans[k]=String.valueOf(cc);
                        cc++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}