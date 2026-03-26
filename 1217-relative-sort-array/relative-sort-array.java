class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr2){
            map.put(i,0);
        }
        for(int i : arr1){
            if(map.containsKey(i)){
                int n = map.get(i);
                map.put(i,n+1);
            }
            else{
                list.add(i);
            }
        }
        Collections.sort(list);
        int idx=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int a = m.getKey();
            int b = m.getValue();
            for(int j=0;j<b;j++){
                arr1[idx]=a;
                idx++;
            }
        }
        for(int i=0;i<list.size();i++){
            arr1[idx]=list.get(i);
            idx++;
        }
        return arr1;

    }
}