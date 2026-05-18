class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hash = new HashMap <>();
        for (String s : strs) {
            char [] charS = s.toCharArray();
            Arrays.sort(charS);
            String c = new String (charS);
            hash.putIfAbsent(c, new ArrayList<>());
            hash.get(c).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}
