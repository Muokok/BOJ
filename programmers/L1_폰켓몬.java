package programmers;

import java.util.*;

public class L1_폰켓몬 {
    public int solution(int[] nums) {

        Set<Integer> Hset = new HashSet<>();

        for(int num : nums){
            Hset.add(num);
        }

        if(Hset.size() > nums.length/2){
            return nums.length/2;
        }else{
            return Hset.size();
        }
    }
}
