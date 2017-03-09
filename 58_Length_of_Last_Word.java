public class Solution {
    public int lengthOfLastWord(String s) {
        //trim(), Returns a string whose value is this string,
        //with any leading and trailing whitespace removed.
        return s.trim().length() - s.trim().lastIndexOf(" ") -1;
    }
}
