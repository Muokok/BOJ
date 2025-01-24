import java.io.*;
import java.util.*;

public class Q10825 { // 국영수

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, int []> map = new HashMap<>(); // 이름과 점수 배열을 담을 Map

        int N = Integer.parseInt(br.readLine());
        String [] answer = new String [N]; // 정답을 담는 배열

        for(int i=0; i<N; i++){
            String [] input = br.readLine().split(" ");
            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);



            int [] scores = {korean, english, math};
            map.put(name, scores);
        }



    }
}
