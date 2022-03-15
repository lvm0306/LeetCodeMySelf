package easy.code021;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 类似归并排序中的合并过程
        //创建一个初始节点 指向0
        ListNode dummyHead = new ListNode(0);
        //节点下标
        ListNode cur = dummyHead;
        //开始循环
        while (list1 != null && list2 != null) {
            //如果list1 小于 list2
            if (list1.val < list2.val) {
                //节点下标 指向 一个节点
                cur.next = list1;
                //节点下标 指向下一个节点
                cur = cur.next;
                //list1 往下走一个节点
                list1 = list1.next;
            } else {
                //节点下标 指向 一个节点
                cur.next = list2;
                //节点下标 指向下一个节点
                cur = cur.next;
                //list2 往下走一个节点
                list2 = list2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        /*
         * 为什么返回next 因为
         * 输入：
         * [1,2,4]
         * [1,3,4]
         * 输出：
         * [0,1,1,2,3,4,4]
         * 预期结果：
         * [1,1,2,3,4,4]
         * 吧0剔除掉
         */
        return dummyHead.next;
    }
}