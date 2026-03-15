class Fancy {
    ArrayList<Long> arr;
    long add;
    long mult;
    long MOD = 1000000007;
    public Fancy() {
        arr = new ArrayList<>();
        add = 0;
        mult = 1;
    }
    // Modular Inverse (Fermat's Little Theorem)
    private long power(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }

    private long modInverse(long n) {
        return power(n, MOD - 2);
    }

    public void append(int val) {
        // "Reverse" the current changes so when they are applied later, 
        // we get the original 'val' back.
        long x = (val - add + MOD) % MOD;
        arr.add((x * modInverse(mult)) % MOD);
    }
    
    public void addAll(int inc) {
        add = (add+inc)%MOD;
    }
    
    public void multAll(int m) {
        add = (add*m)%MOD;
        mult = (mult*m)%MOD;
    }
    
    public int getIndex(int idx) {
       if (idx >= arr.size()) return -1;
        // Apply global multiplication and addition
        long res = (arr.get(idx) * mult) % MOD;
        res = (res + add) % MOD;
        return (int) res;
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