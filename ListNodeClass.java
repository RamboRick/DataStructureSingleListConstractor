public class ListNode{
    public int item;
    public ListNode next;
    
    public ListNode(int i, ListNode n) {
        item = i;
        next = n;
    }
    
    public ListNode (int i ){
        this (i, null);
    }
    
    ListNode l1 = new ListNode();
    ListNode l2 = new ListNode();
    ListNode l3 = new ListNode();
    
    l1.next = l2;
    l2.next = l3;
    l3.next = null;
    
    public void insertAfter(int item) {
        next = new ListNode(item. next);
    }
    
    
}



 
                   