package easy.code014;

import java.util.HashMap;

/**
 * 123 / 123 个通过测试用例
 * 状态：通过
 * 执行用时: 1 ms
 * 内存消耗: 39.6 MB
 */
class Solution2 {
    public String longestCommonPrefix(String[] strs) {

        //String [] s=new String[]{"flower","flow","flight"};
        if (strs[0].equals("")){
            return "";
        }
        String s=strs[0];
        for ( int i=1;i<strs.length;i++){
            int j=0;
            for (;j<Math.min(s.length(),strs[i].length());j++){
                if (s.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            s=s.substring(0,j);
        }
        return s;
    }
}