package silver;

import java.io.*;
import java.util.*;

public class Q10825 { // 국영수
    static Map<String, int []> map = new HashMap<>(); // 이름과 점수 배열을 담을 Map


    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [] answer = new String [N]; // 정답을 담는 배열

        for(int i=0; i<N; i++){
            String [] input = br.readLine().split(" ");
            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);

            answer[i] = name;
            int [] scores = {korean, english, math};
            map.put(name, scores);
        }

        Arrays.sort(answer, new Comp());

        for(String str : answer){
            System.out.println(str);
        }

    }

    static class Comp implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            int korean1 = map.get(s1)[0];
            int korean2 = map.get(s2)[0];
            int english1 = map.get(s1)[1];
            int english2 = map.get(s2)[1];
            int math1 = map.get(s1)[2];
            int math2 = map.get(s2)[2];

            // 국어 점수 내림차순
            if(korean1 != korean2){
                return korean2 - korean1;
            }
            // 영어 점수 오름차순
            if(english1 != english2){
                return english1 - english2;
            }
            // 수학 점수 내림차순
            if(math1 != math2){
                return math2 - math1;
            }
            // 이름 사전순
            return s1.compareTo(s2);
        }

    }
}
