package easy.code028;

/**
 * 80 / 80 个通过测试用例
 * 状态：通过
 * 执行用时: 302 ms
 * 内存消耗: 41.6 MB
 */
public class Solution1 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")&haystack.equals("")){
            return 0;
        }
        int needlenght=needle.length();
        int haylenght=haystack.length();
        if (haylenght<needlenght){
            return -1;
        }
        for (int i=0;i<=haylenght-needlenght;i++){
            String substring = haystack.substring(i, i + needlenght);
            if (substring.equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
