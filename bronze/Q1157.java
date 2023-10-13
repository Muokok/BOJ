package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();
        ArrayList<Character> cList = new ArrayList<>(); // 개수를 확인한 문자들 List

        int max_count=0;
        String result ="";

        for(int i=0; i<s.length(); i++){
            int count=0;
            if(cList.contains(s.charAt(i))){
                continue;
            }
            cList.add(s.charAt(i)); // 앞에서 개수를 확인한 문자를 뒤에서 다시 확인하지 않기 위함
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(max_count == count){
                result = "?";
            }
            if(max_count < count){
                max_count = count;
                result = String.valueOf(s.charAt(i));
            }
        }
        System.out.println(result.toUpperCase());
    }
}
