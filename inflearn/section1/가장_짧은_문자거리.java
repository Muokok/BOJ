package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_짧은_문자거리 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        int p=1000;
        int [] answer = new int [str.length()];

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                p=0;
                answer[i]=p;
            }
            else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;

        for(int j=str.length()-1; j>=0; j--){
            if(str.charAt(j) == c){
                p=0;
            }
            else {
                p++;
                answer[j]=Math.min(answer[j], p);// 둘 중 작은 값을 대입
            }
        }

        for (Integer result: answer){
            System.out.print(result + " ");
        }


    }

}
