package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 단어_뒤집기 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        단어_뒤집기 M = new 단어_뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        String [] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        for (String result: M.solution(N,arr)){
            System.out.println(result);
        }
    }
/*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        String [] arr = new String[N];
        for(int i=0; i<N; i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            sb.reverse();
            arr[i] = sb.toString();
            sb.setLength(0); // sb의 모든 데이터 삭제
        }

        for (String result: arr){
            System.out.println(result);
        }
    }*/
}
