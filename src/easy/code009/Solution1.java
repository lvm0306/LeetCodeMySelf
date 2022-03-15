package easy.code009;

/**
 * 用字符串拆解的方式去解
 * 11510 / 11510 个通过测试用例
 * 状态：通过
 * 执行用时: 5 ms
 * 内存消耗: 40.8 MB
 *
 */
public class Solution1 {

    public boolean isPalindrome(int x) {
        String t=String.valueOf(x);
        int mid=0;
        if (t.length()%2==0)
        {
            mid=t.length()/2+1;
        }else {
            mid=t.length()/2;
        }
        for (int i=0;i<mid;i++){
            if (t.charAt(i)!=t.charAt(t.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

