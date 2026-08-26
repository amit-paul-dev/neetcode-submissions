class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s:strs){
            char[] string_to_chars = s.toCharArray();
            Arrays.sort(string_to_chars);
            String char_to_string = new String(string_to_chars);
            if(!map.containsKey(char_to_string)){
                map.put(char_to_string, new ArrayList<>());
            } 
            map.get(char_to_string).add(s);
        }

        List<List<String>> outputList = new ArrayList<>();

        for(List<String>output : map.values()){
            outputList.add(output);
        }

        return outputList;
        
    }
}
