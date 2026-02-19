class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int a =1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            char cprev = s.charAt(i-1);
            if(c==cprev) a++;
            else{
                list.add(a);
                a=1;
            }
        }
        list.add(a);
        for(int i=0;i<list.size()-1;i++){
            int num1 = list.get(i);
            int num2 = list.get(i+1);
            ans+=Math.min(num1,num2);
        }
        return ans;
    }
}