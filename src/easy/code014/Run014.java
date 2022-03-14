package easy.code014;

public class Run014 {
    public static void main(String[] args) {
        String [] s=new String[]{"flower","flow","flight"};
        Solution1 solution1=new Solution1();
        String re = solution1.longestCommonPrefix(s);
        System.out.println(re);
        Solution2 solution2=new Solution2();
        String re2 = solution2.longestCommonPrefix(s);
        System.out.println(re2);
    }
}
