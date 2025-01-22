package eecote.Implementation;

import java.util.*;

public class 왕실의_나이트_2 {
    static int [] dx = {2,1,-1,-2,-2,-1,1,2};
    static int [] dy = {1,2,2,1,-1,-2,-2,-1};

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int cnt = 0;

        int x = input.charAt(1) - '0';
        int y = input.charAt(0) - 96;

        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 1 || nx > 8 || ny < 1 || ny > 8){
                continue;
            }

            cnt ++;
        }

        System.out.print(cnt);




    }


}
