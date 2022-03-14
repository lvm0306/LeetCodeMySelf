package easy.code021;

public class Solution2 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        /**
         * 输入：
         * [1,2,4]
         * [1,3,4]
         * 输出：
         * [0,1,1,2,3,4,4]
         * 预期结果：
         * [1,1,2,3,4,4]
         */
        /**
         *
         * [_1_,2,4]
         * [1,3,4]
         * [1]
         */
        ListNode listNode= list1.val<=list2.val?list1:list2;
        listNode.next=mergeTwoLists(listNode.next,list1.val>list2.val?list1:list2);
        return listNode;
    }
}
