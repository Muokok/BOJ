package inflearn.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 학급_회장_해쉬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Character result = ' ';

        Map<Integer, Character> map = new HashMap<>();

        int max = 0;

        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A'){
                numA ++;
            } else if (input.charAt(i) == 'B') {
                numB ++;
            } else if (input.charAt(i) == 'C') {
                numC ++;
            } else if (input.charAt(i) == 'D') {
                numD ++;
            }else {
                numE ++;
            }
        }

        map.put(numA, 'A');
        map.put(numB, 'B');
        map.put(numC, 'C');
        map.put(numD, 'D');
        map.put(numE, 'E');

        for (Integer i : map.keySet()) {
            if (max < i){
                max = i;
                result = map.get(i);
            }
        }

        System.out.println(result);
    }

}
