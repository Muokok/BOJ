package inflearn.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 아나그램_해쉬 {

    private static String solution(String str1, String str2){

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(solution(str1, str2));

    }

}
