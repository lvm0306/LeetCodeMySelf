package easy.code001;

public class Run {
    public static void main(String[] args) {
        Solution1 r1=new Solution1();
        int[] int1 = r1.twoSum(new int[]{1, 2, 3}, 5);
        System.out.println(int1[0]+"=="+int1[1]);

        Solution2 r2=new Solution2();
        int[] int2 = r2.twoSum(new int[]{1, 2, 3}, 5);
        System.out.println(int2[0]+"=="+int2[1]);
    }
}
