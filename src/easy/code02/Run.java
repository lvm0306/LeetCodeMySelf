package easy.code02;

public class Run {
    public static void main(String[] args) {
        Result1 r1=new Result1();
        int[] ints = r1.twoSum(new int[]{1, 2, 3}, 5);
        System.out.println(ints[0]+"=="+ints[1]);
    }
}
