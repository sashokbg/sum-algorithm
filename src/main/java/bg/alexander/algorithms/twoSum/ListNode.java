package bg.alexander.algorithms.twoSum;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return val+(next == null ? "" : " -> "+next.toString()) ;
    }
}
