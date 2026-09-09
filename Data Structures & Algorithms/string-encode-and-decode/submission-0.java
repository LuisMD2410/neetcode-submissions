class Solution {

    public String encode(List<String> strs) {
        String result = "";
        
        for (String str : strs) {
            int length = str.length();

            if (length < 10) {
                result += "00" + length;
            } else if (length < 100) {
                result += "0" + length;
            } else {
                result += length;
            }

            result += str;
        }

        return result;
    }

    public List<String> decode(String str) {
        int index = 0;
        int encodedLength = str.length();
        List<String> decodedStrings = new ArrayList<>();

        // if (encodedLength == 3) {
            //decodedStrings.add("");
            //return decodedStrings;
        //} 

        while (index != encodedLength) {
            int strLength = Integer.parseInt(str.substring(index, index + 3));
            index += 3;
            decodedStrings.add(str.substring(index, index + strLength));
            index += strLength;
        }

        return decodedStrings;
    }
}
