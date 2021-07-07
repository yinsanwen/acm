package me.load.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author yinsanwen
 * @date 2019/9/21
 */
public class No2AddTwoNumbers {


    public static void main(String[] args) {
        No2AddTwoNumbers no2AddTwoNumbers = new No2AddTwoNumbers();

//        Double.POSITIVE_INFINITY


    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultHead = new ListNode(-1);

        int tmp = 0;
        int carry = 0;
        ListNode tmpNode = resultHead;
        while (l1 != null && l2 != null) {
            tmp = l1.val + l2.val + carry;
            if (tmp >= 10){
                tmp = tmp - 10;
                carry = 1;
            }else {
                carry = 0;
            }
            ListNode resultNode = new ListNode(tmp);
            tmpNode.next = resultNode;
            tmpNode = tmpNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            tmp = l1.val + carry;
            if (tmp >= 10){
                tmp = tmp - 10;
                carry = 1;
            }else {
                carry = 0;
            }
            ListNode resultNode = new ListNode(tmp);
            tmpNode.next = resultNode;
            tmpNode = tmpNode.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            tmp = l2.val + carry;
            if (tmp >= 10){
                tmp = tmp - 10;
                carry = 1;
            }else {
                carry = 0;
            }
            ListNode resultNode = new ListNode(tmp);
            tmpNode.next = resultNode;
            tmpNode = tmpNode.next;
            l1 = l2.next;
        }

        if (carry > 0){
            ListNode resultNode = new ListNode(carry);
            tmpNode.next = resultNode;
        }

        return resultHead.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
