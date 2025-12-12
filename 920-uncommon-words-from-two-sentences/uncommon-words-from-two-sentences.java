class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for(String i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i : arr2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> m : map.entrySet()){
            if(m.getValue()==1) list.add(m.getKey());
        }
        
        return list.toArray(new String[0]);
    }
}