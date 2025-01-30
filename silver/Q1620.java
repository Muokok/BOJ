package silver;

import java.io.*;
import java.util.*;
/*
* 입력받은 값이 정수형인지 String인지 확인하는 방법을 몰랐었음.
* Map을 활용할 줄 몰랐음.
* */
public class Q1620 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> strToNum = new HashMap<>();
        Map<Integer, String> numToStr = new HashMap<>();

        String [] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for(int i=0; i<n ;i++){
            String name = br.readLine();
            strToNum.put(name, i);
            numToStr.put(i, name);
        }

        for(int i=0; i<m; i++){
            String quest = br.readLine();
            /*
            * if(49 <= s.charAt(0) && s.charAt(0) <= 57 -> 입력받은 값의 첫번째 문자열이 1~9에 해당하는지 확인하는 코드이다.
            * 아래처럼 try-catch도 가능하고, 위처럼 확인도 가능하다.
            * */

            if(isNumberic(quest)){ // String인지 확인하는 이 부분이 헷갈렷음
                bw.write(numToStr.get(Integer.parseInt(quest)) + "\n");
            }else{
                bw.write((strToNum.get(quest) + 1) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isNumberic(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
