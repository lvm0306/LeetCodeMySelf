package easy.code009;

/**
 * 数学解法
 */
public class Solution2 {

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            //12321
            //rem =1 quo =1232 y=1
            //rem =2 quo =123 y=12
            //rem =3 quo =12 y=123
            //rem =2 quo =1 y=1232
            //rem =1 quo =0;12321
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;
    }
}
