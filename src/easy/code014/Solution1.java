package easy.code014;

/**
 123 / 123 个通过测试用例
 状态：通过
 执行用时: 0 ms
 内存消耗: 39.1 MB
 */
class Solution1 {
    public String longestCommonPrefix(String[] strs) {

        //String [] s=new String[]{"flower","flow","flight"};
        String s = strs[0];//flower
        for (String s1 : strs) {
            while (!s1.startsWith(s)) {
                s = s.substring(0, s.length() - 1);//flow
                if (s.length() == 0) {
                    return "";
                }
            }
        }
        return s;
    }
}