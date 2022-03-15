package easy.code001;

import java.util.HashMap;

/**
 * 双解相关 尽量考虑HashMap
 * 57 / 57 个通过测试用例
 * 状态：通过
 * 执行用时: 5 ms
 * 内存消耗: 42.1 MB
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if (hashMap.containsKey(temp)){
                a[0]=hashMap.get(temp);
                a[1]=i;
            }
            hashMap.put(nums[i],i);
        }
        return a;
    }
}
