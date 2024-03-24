package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문장_속_단어 {

/*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String max = "";

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        while (st.countTokens() != 0) {
            String word = st.nextToken();

            if(max.length() < word.length()){
                max = word;
            }
        }
        System.out.println(max);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);

        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
        // UPAQ-PCKLPBS,
        //시간차이(m) : 2
        //2099272 bytes
    }
    */


    // 위 방식은 String 객체의 값을 계속해서 바꾸면서,
    // 힙 메모리에 쓰레기 값이 계속해서 생성되기 때문에(String의 불변성)
    // 아래 방식처럼 배열에 넣는 것으로 바꿔봄.
    // 결론: 11만개의 단어 테스트를 했는데 메모리,시간 둘 다 큰 차이는 없음
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [] arr = {""}; // 가장 길이가 긴 단어를 넣을 배열 사용

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        while (st.countTokens() != 0) {
            String word = st.nextToken();

            if(arr[0].length() < word.length()){
                arr[0] = word;
            }
        }
        System.out.println(arr[0]);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);

        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
        //UPAQ-PCKLPBS,
        //시간차이(m) : 2
        //2099672 bytes
    }
}
