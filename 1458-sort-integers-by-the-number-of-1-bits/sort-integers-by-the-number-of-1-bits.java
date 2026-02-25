class Solution {
    public int[] sortByBits(int[] arr) {

        //DIRECT METHOD TO CONVERT INTO INTEGER ARRAY 
        // Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer [] :: new);
        Integer[] temp = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b) -> {
            int bita = Integer.bitCount(a);
            int bitb = Integer.bitCount(b);
            if(bita==bitb) return a-b;
            return bita-bitb;
        });

        // DIRECT METHOD TO CONVERT INTEGER ARRAY TO INT ARRAY
        // arr = Arrays.stream(temp).mapToInt(i -> i).toArray();
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        return arr;
    }
}