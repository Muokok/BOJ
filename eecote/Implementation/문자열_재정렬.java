package eecote.Implementation;

import java.util.*;

public class 문자열_재정렬 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Character> alphaList = new ArrayList<>();

        //K1KA5CB7
        String input = sc.next();
        int num = 0;

        for(int i=0; i<input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                alphaList.add(input.charAt(i));

            }else{
                num += input.charAt(i) - '0';
            }
        }

        Collections.sort(alphaList);


        for(Character ch : alphaList){
            System.out.print(ch);
        }
        if(num !=0) System.out.print(num);

    }
}
