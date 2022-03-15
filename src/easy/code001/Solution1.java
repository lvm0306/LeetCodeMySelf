package easy.code001;

/**
 纯暴力解发 双重for循环 时间O(n^2)
 57 / 57 个通过测试用例
 状态：通过
 执行用时: 55 ms
 内存消耗: 41.5 MB
 */
public class Solution1 {
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