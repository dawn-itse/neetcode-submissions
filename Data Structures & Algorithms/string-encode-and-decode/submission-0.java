class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for (String str : strs) {
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodeString = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            String result = str.substring(i, i + length);
            decodeString.add(result);
            i += length;
        }
        return decodeString;
    }
}
