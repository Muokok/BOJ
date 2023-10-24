package bronze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q11005 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Character> allNums = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>(); // 나머지를 저장할 배열
        
        int currentIntNumber = 0;
        char currentCharNum ='0';
        while (currentCharNum <= '9') {
            allNums.put(currentIntNumber, currentCharNum);
            currentCharNum++;
            currentIntNumber++;
        }

        char currentCharLetter = 'A';
        while (currentCharLetter <= 'Z') {
            allNums.put(currentIntNumber, currentCharLetter);
            currentCharLetter++;
            currentIntNumber++;
        }
        /*
        *   N / B = 몫1
            N % B = 나머지 >> 배열에 추가

            몫1 / B = 몫2
            몫1 % B = 나머지 >> 배열에 추가
        * */

        int N = scan.nextInt();
        int B = scan.nextInt();

        while(N >= B){

            arr.add(N % B);
            System.out.println(N%B);
            N = (N / B);
            System.out.println(N);
        }
        arr.add(N);

        for(int i= arr.size()-1; i>=0; i--){
            System.out.print(allNums.get(arr.get(i)));
        }


    }
}
