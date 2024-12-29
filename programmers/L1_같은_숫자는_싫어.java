package programmers;

import java.util.*;

public class L1_같은_숫자는_싫어 {

    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i] != stack.peek() ){
                stack.push(arr[i]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int num : stack){
            list.add(num);
        }

        int[] answer = new int [list.size()];


        for(int j = 0; j<list.size(); j++){
            answer[j] = list.get(j);
        }


        return answer;
    }
}
