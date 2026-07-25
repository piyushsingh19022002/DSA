class Solution {
    public int maxProduct(int n) {
        List<Integer> ls = new ArrayList<>();

        int temp = n;
        while(temp!=0){
            ls.add(temp%10);
            temp/=10;
        }
        Collections.sort(ls);
        return ls.get(ls.size()-1)*ls.get(ls.size()-2);
    }
}