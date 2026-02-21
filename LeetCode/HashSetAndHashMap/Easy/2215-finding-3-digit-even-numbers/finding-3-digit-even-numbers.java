class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < digits.length;i++){
            map.put(digits[i],map.getOrDefault(digits[i],0)+1);
        }
        for(int i = 100 ; i <=999 ; i++){
            int x = i;
            int a = x%10;
            x/=10;
            int b = x%10;
            x/=10;
            int c = x;
            if(map.containsKey(a)){
                int afreq = map.get(a);
                map.put(a,afreq-1);
                if(afreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bfreq = map.get(b);
                    map.put(b,bfreq-1);
                    if(bfreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        if(i%2==0) ans.add(i);
                    }
                    map.put(b,bfreq);
                }
                map.put(a,afreq);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}