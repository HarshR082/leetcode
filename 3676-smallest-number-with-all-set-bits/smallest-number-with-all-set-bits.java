class Solution {
    public int smallestNumber(int x) {
        while((x&(x+1))!=0){
            x++;
        }
        return x;
    }
}