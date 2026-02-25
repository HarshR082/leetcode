class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
        Arrays.sort(temp,(a,b) -> {
            int bita = Integer.bitCount(a);
            int bitb = Integer.bitCount(b);
            if(bita==bitb) return a-b;
            return bita-bitb;
        });
        arr = Arrays.stream(temp).mapToInt(i -> i).toArray();
        return arr;
    }
}