package DSA.LinkedList.S1Easy;

public class Q11AddTwoLL {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while (l1 != null && l2 != null) {
            int sum = c + l1.data + l2.data;
            ListNode t;
            if (sum < 10) {
                t = new ListNode(sum);
                c = 0;
            } else {
                t = new ListNode(sum % 10);
                c = sum / 10;
            }
            temp.next = t;
            temp = t;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = c + l1.data;
            ListNode t;
            if (sum < 10) {
                t = new ListNode(sum);
                c = 0;
            } else {
                t = new ListNode(sum % 10);
                c = sum / 10;
            }
            temp.next = t;
            temp = t;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = c + l2.data;
            ListNode t;
            if (sum < 10) {
                t = new ListNode(sum);
                c = 0;
            } else {
                t = new ListNode(sum % 10);
                c = sum / 10;
            }
            temp.next = t;
            temp = t;
            l2 = l2.next;
        }
        if (c >= 1) {
            ListNode t = new ListNode(c);
            temp.next = t;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        h1.next = new ListNode(3);
        h2.next = new ListNode(3);
        h1 = addTwoNumbers(h1, h2);
        while (h1 != null) {
            System.out.print(h1.data + "->");
            h1=h1.next;
        }
        System.out.println("NULL");
    }
}
