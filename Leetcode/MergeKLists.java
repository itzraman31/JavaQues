import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() { this.val = 0; this.next = null; }
    ListNode(int val) { this.val = val; this.next = null; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeKLists {
    private static void respass(ListNode head, ListNode lists) {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            tail(lists, temp.val);
            temp = temp.next;
        }
    }

    private static void tail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    private static void sorting(ListNode head) {
        ListNode temp1 = head;
        while (temp1.next != null) {
            ListNode temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.val > temp2.val) {
                    int temp = temp1.val;
                    temp1.val = temp2.val;
                    temp2.val = temp;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }

    public static ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size() == 0) {
            return null;
        }
        int a = -1;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            return null;
        }
        for (int i = 1; i < lists.size(); i++) {
            if (i != a) {
                respass(lists.get(i), lists.get(a));
            }
        }
        sorting(lists.get(a));
        return lists.get(a);
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));
        List<ListNode> lists = Arrays.asList(list1, list2, list3);
        ListNode mergedList = mergeKLists(lists);
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}
