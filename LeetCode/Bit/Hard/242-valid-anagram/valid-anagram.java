class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0 ; i<ch1.length ;i++){
            if(ch1[i]!=ch2[i]) return false;
        }
        return true;
    }
}
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length())return false;
//         HashMap<Character,Integer> map1 = new HashMap<>();
//         HashMap<Character,Integer> map2 = new HashMap<>();
//         for(int i = 0 ; i < s.length();i++){
//             char ch = s.charAt(i);
//            if(map1.containsKey(ch)){
//             int freq = map1.get(ch);
//             map1.put(ch,freq+1);
//            }else{
//             map1.put(ch,1);
//            }
//         }
//         for(int i = 0 ; i < t.length();i++){
//             map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
//         }
//         for(char key : map1.keySet()){
//             if(!map2.containsKey(key)) return false;
//             if(!map1.get(key).equals(map2.get(key))) return false; // don't use != comparision here
//                                                                 // values are stored in Integer wrapper
//                                                                 // class sometime it does't work
//                                                                 // solu 1 use .equals to compare
//                                                                 // solu 2 store value of both in int var
//                                                                 // then compare
//         }
//         return true;
//     }
// }