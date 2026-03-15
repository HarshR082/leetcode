import java.util.*;

class Fancy { 
    ArrayList<Long> list;
    long mul = 1;
    long add = 0;
    int MOD = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
    }
    
    public void append(int val) {
        long normalized = ((val - add) % MOD + MOD) % MOD;
        normalized = (normalized * modInverse(mul)) % MOD;
        list.add(normalized);
    }
    
    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }
    
    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }
    
    public int getIndex(int idx) {
        if(idx >= list.size()) return -1;
        return (int)((list.get(idx) * mul + add) % MOD);
    }

    private long modInverse(long x){
        return power(x, MOD - 2);
    }

    private long power(long a,long b){
        long res = 1;
        a %= MOD;
        while(b > 0){
            if((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */