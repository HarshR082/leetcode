class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]); // Always add the first word
        
        for (int i = 1; i < words.length; i++) {
            String prev = result.get(result.size() - 1);
            if (!isanagram(prev, words[i])) {
                result.add(words[i]);
            }
        }
        
        return result;
    }
    private boolean isanagram(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return(Arrays.equals(c1,c2)); 
    }
}