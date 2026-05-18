class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char [] cS = s.toCharArray();
        char [] cT = t.toCharArray();
        Arrays.sort(cS);
        Arrays.sort(cT);
        return Arrays.equals(cS,cT);
    }
}
