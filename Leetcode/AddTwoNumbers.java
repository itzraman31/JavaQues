class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
        ListNode(int x, ListNode next) { this.val = x; this.next = next; }
    }

    private static void insertAtTail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = new ListNode(1);
        ListNode temp1 = l1, temp2 = l2;
        int carry = 0, d1 = 0, d2 = 0, a, b;

        while (d1 == 0 || d2 == 0) {
            if (temp1 != null) {
                a = temp1.val;
                temp1 = temp1.next;
            } else {
                a = 0;
                d1 = 1;
            }

            if (temp2 != null) {
                b = temp2.val;
                temp2 = temp2.next;
            } else {
                b = 0;
                d2 = 1;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;

            if (d1 == 0 || d2 == 0 || sum > 0) {
                insertAtTail(n1, sum);
            }
        }
        return n1.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
