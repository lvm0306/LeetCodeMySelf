package easy.code02;

/**
 * 执行用时：
 * 55 ms
 * , 在所有 Java 提交中击败了
 * 25.92%
 * 的用户
 * 内存消耗：
 * 41.5 MB
 * , 在所有 Java 提交中击败了
 * 22.14%
 * 的用户
 * 通过测试用例：
 * 57 / 57
 */
public class Result1 {
    public int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
}