package problems.p0021_merge_two_sorted_lists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode outputlist = new ListNode();
        ListNode currentNode = outputlist;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        if (list1 != null) {
            currentNode.next = list1;
        }
        if (list2 != null) {
            currentNode.next = list2;
        }

        return outputlist.next;
    }
}
