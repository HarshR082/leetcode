class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minabs = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int a = Math.abs(arr[i]-arr[i+1]);
            if(a<minabs) minabs = a;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == minabs){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
            
        }
        return list;

    }
}