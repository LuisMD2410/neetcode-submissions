class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        
        for (String str : strs) {
            int length = str.length();

            if (length < 10) {
                result.append("00").append(length);
            } else if (length < 100) {
                result.append("0").append(length);
            } else {
                result.append(length);
            }

            result.append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        int index = 0;
        int encodedLength = str.length();
        List<String> decodedStrings = new ArrayList<>();

        while (index != encodedLength) {
            int strLength = Integer.parseInt(str.substring(index, index + 3));
            index += 3;
            decodedStrings.add(str.substring(index, index + strLength));
            index += strLength;
        }

        return decodedStrings;
    }
}
