package org.example.addtwonumbers;

public class AddTwoNumbers {

  public ListNode solution(ListNode l1, ListNode l2) {
    return recursion(l1, l2, 0);
  }

  private ListNode recursion (ListNode l1, ListNode l2, int carry) {

    if (l1 != null || l2 != null || carry > 0) {

      int val1 = l1 == null ? 0 : l1.val;
      int val2 = l2 == null ? 0 : l2.val;
      int sum = val1 + val2 + carry;
      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;

      return new ListNode(sum % 10, recursion (l1, l2, sum/10));
    }
    return null;
  }
}


//
//
////    ListNode previous = new ListNode((l1.getVal() + l2.getVal()) % 10);
////    ListNode first = previous;
//    int tens = (l1.getVal() + l2.getVal())/10;
//
//    while ((l1 != null && l1.getNext() != null) || (l2 != null && l2.getNext() != null)) {
//
//      int sum = l1.getVal() + l2.getVal();
//      ListNode previous = null;
//      ListNode current = new ListNode(sum, previous);
//      l1 = l1.getNext();
//      l2 = l2.getNext();
//      previous = new ListNode()
//
//      if(l1 != null) l1 = l1.getNext();
//      if(l2 != null) l2 = l2.getNext();
//      int val1 = l1 == null? 0 : l1.getVal();
//      int val2 = l2 == null? 0 : l2.getVal();
////      int sum = val1 + val2;
//      ListNode current = new ListNode(sum % 10 + tens);
//      tens = sum/10;
//      previous.setNext(current);
//      previous = current;
//    }
//    return first;
//  }
//}
