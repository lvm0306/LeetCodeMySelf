package easy.code058;

public class Solution2 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length -1].length();

    }
}
