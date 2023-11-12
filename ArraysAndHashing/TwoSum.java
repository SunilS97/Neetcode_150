package ArraysAndHashing;
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder = target - nums[i];
            if(myMap.containsKey(remainder))
                return new int[] {myMap.get(remainder), i};
            myMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("not found");
    }
}
