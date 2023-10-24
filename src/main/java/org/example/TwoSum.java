package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] solution(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int secondNum = target - num;
      if (numToIndex.containsKey(secondNum)) {
        return new int[] {i, numToIndex.get(secondNum)};
      }
        numToIndex.put(num, i);
      }
    return new int[0];
  }
}
