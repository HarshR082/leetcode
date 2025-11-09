class Solution {
    public int countOperations(int num1, int num2) {
        int count =0;
        while(true){
            if(num1==0 || num2==0) break;
            else{
                if(num1>num2){
                    num1=num1-num2;
                    count++;
                }if(num2>num1){
                    num2=num2-num1;
                    count++;
                }if(num1==num2){
                    num1=num1-num2;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}