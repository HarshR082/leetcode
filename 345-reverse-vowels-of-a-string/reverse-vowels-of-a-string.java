class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char cc = s.charAt(i);
            char c=Character.toLowerCase(cc);
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
                list.add(cc);
            }

        }
        Collections.reverse(list);
        String ans = "";
        int index=0;
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            char k1 = Character.toLowerCase(k);
            if(k1=='a'||k1=='e'||k1=='o'||k1=='i'||k1=='u'){
                char ch = list.get(index);
                ans+=ch;
                index++;
            }else{
                ans+=k;
            }
        }
        return ans;
    }
}