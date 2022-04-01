package easy.code066;

public class Run066 {
    public static void main(String[] args) {
        Solution1 solution1=new Solution1();
        int[] ints = solution1.plusOne(new int[]{9,9});
        for (int i:ints){
            System.out.print(i+"=");
        }
    }
}
