package leetcode.Interview_Classic_150_Questions;

/**
 * @author: yzy
 **/
public class l26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums[j]) {
                    nums[++j] = nums[i];
                }
            }
            return j + 1;
        }
    }
}
