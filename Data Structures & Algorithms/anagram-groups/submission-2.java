class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> > map = new HashMap<>();
        for (String s : strs) {
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String result = String.valueOf(charS);
            map.putIfAbsent(result, new ArrayList<>());
            map.get(result).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
