package eecote.Implementation;

import java.util.*;

public class 왕실의_나이트 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] dx = {1,2,2,1,-1,-2,-2,-1};
        int [] dy = {2,1,-1,-2,-2,-1,1,2};
                    //ㄱ,ㄴ,」,』ㄱ,
        int cnt = 0;

        String input = sc.next();

        int x = input.charAt(0) - '0' - 48; // 아래처럼 개선 가능
        // int x = input.charAt(0) - 'a' + 1;
        int y = input.charAt(1) - '0';

        for(int i=0; i<8; i++){
            if(x+dx[i] <1 || x+dx[i] >8 || y+dy[i] <1 || y+dy[i] >8){
                continue;
            }
            cnt ++;
        }

        System.out.print(cnt);

    }
}
