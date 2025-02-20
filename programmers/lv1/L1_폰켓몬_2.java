package programmers.lv1;
import java.util.*;

public class L1_폰켓몬_2 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }


        return set.size() > nums.length/2 ? nums.length/2 : set.size();
    }
}
