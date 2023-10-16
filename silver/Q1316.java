package silver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q1316 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        ArrayList <Character> dupList = new ArrayList<>();
        HashSet<Character> noDupList = new HashSet<>();

        int i = scan.nextInt();
        int count = 0;

        for(int j=0; j < i; j++){ // i개만큼 입력받기
            String s = scan.next();
            dupList.clear();
            noDupList.clear();
            
            for(int l=0; l <s.length(); l++){ 
                if( l < s.length() -1 && s.charAt(l) == s.charAt(l+1) ){
                    continue;
                }
                else{ // 현재 인덱스 문자와 다음 인덱스 문자가 다를 때
                    dupList.add(s.charAt(l));
                }
            }


            for(Character item : dupList){
                noDupList.add(item);
            }

            System.out.println(noDupList);
            System.out.println(dupList);

            if(noDupList.size() == dupList.size()){// dupList와 dupList에서 중복을 제거한 배열과 같으면 count ++, 아니면 break
                count++;
            }

        }
        System.out.println(count);
    }

}
