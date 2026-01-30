class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] cop = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=cop[i]) count++;
        }
        return count;
    }
}