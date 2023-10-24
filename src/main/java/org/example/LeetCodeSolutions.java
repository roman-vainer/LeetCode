package org.example;

import java.util.Arrays;
import org.example.addtwonumbers.AddTwoNumbers;
import org.example.addtwonumbers.ListNode;

public class LeetCodeSolutions {

  public static void main(String[] args) {
//        twoSum();
    addTwoNumbers();
  }

  private static void addTwoNumbers() {
    ListNode l16 = new ListNode(9);
    ListNode l15 = new ListNode(9, l16);
    ListNode l14 = new ListNode(9, l15);
    ListNode l13 = new ListNode(9, l14);
    ListNode l12 = new ListNode(9, l13);
    ListNode l11 = new ListNode(9, l12);
    ListNode l1 = new ListNode(9, l11);

    ListNode l23 = new ListNode(9);
    ListNode l22 = new ListNode(9, l23);
    ListNode l21 = new ListNode(9, l22);
    ListNode l2 = new ListNode(9, l21);

    System.out.println(
        "first num: " + l1.val + l11.val + l12.val + l13.val + l14.val + l15.val + l16.val);
    System.out.println("second num: " + l2.val + l21.val + l22.val + l23.val);
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode result = addTwoNumbers.solution(l1, l2);

    System.out.println(result.val);
    while (result.next != null) {
      result = result.next;
      System.out.println(result.val);
    }
  }

  private static void twoSum() {
    int[] nums = new int[]{1, 2, 5, 7, 8, 4};
    int target = 13;
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.solution(nums, target);
    System.out.println(Arrays.toString(result));
  }
}

