class Solution {
    public boolean squareIsWhite(String coordinates) {
        char alpha = coordinates.charAt(0);
        char n  = coordinates.charAt(1);
        int num = Character.getNumericValue(n);
        if(alpha=='a' || alpha=='c' || alpha=='e' || alpha=='g'){
            if(num%2==0) return true;
            else return false;
        }else{
            if(num%2==0) return false;
        }
        return true;
    }
}