class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Integer> countMap = new HashMap<>();
        
        for(char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }
        
        for(char c: t.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)-1);
        }

        for(int count: countMap.values()){
            if (count!=0){
                return false;
            }
        }

        return true;

    }
}
