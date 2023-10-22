package bronze;

import java.util.HashMap;
import java.util.Scanner;

public class Q2745 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Integer> allNums = new HashMap<>();

        char currentCharNum ='0';
        int currentIntNumber = 0;

        while (currentCharNum <= '9') { // char 숫자에 대응되는 int 숫자를 저장하기 위함
            allNums.put(currentCharNum, currentIntNumber);
            currentCharNum++;
            currentIntNumber++;
        }

        char currentCharLetter = 'A';

        while (currentCharLetter <= 'Z') {  // 알파벳에 대응되는 값 저장하기
            allNums.put(currentCharLetter, currentIntNumber);
            currentCharLetter++;
            currentIntNumber++;
        }

        String N = scan.next();
        int B = scan.nextInt();
        double result = 0;
        int j = 0; // 2^j, ..., 36^j 를 위한 변수

        for(int i=N.length() - 1; i >= 0; i--){
            result = result + Math.pow(B,j)*(allNums.get(N.charAt(i))); // 010110 2 이라면 >> (2^0)*0 + (2^1)*1 + (2^2)*1 + ~~~
            j++;
        }
        System.out.println((int)result);

    }
}
