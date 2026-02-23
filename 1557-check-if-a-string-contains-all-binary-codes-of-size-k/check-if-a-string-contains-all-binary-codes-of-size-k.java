class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = (int)Math.pow(2,k);
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String f = s.substring(i,i+k);
            set.add(f);
        }
        return set.size()==n;
    }
}