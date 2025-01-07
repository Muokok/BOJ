package eecote.Implementation;

import java.io.*;

public class 상하좌우 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] loc = {1,1};

        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");

        for(int i=0; i<input.length; i++){
            switch(input[i]){
                case "R":
                    if(loc[1] + 1 <= N){
                        loc[1] += 1;
                    }
                    break;
                case "L":
                    if(loc[1] -1 >= 1){
                        loc[1] -= 1;
                    }
                    break;
                case "U":
                    if(loc[0] - 1 >= 1){
                        loc[0] -= 1;
                    }
                    break;
                case "D":
                    if(loc[0] + 1 <= N){
                        loc[0] += 1;
                    }
                    break;
            }
        }
        System.out.print(loc[0] +" " + loc[1]);

        /* 개선된 코드 */
//        // L, R, U, D에 따른 이동 방향
//        int[] dx = {0, 0, -1, 1};
//        int[] dy = {-1, 1, 0, 0};
//        char[] moveTypes = {'L', 'R', 'U', 'D'};
//
//        // 이동 계획을 하나씩 확인
//        for (int i = 0; i < plans.length; i++) {
//            char plan = plans[i].charAt(0);
//            // 이동 후 좌표 구하기
//            int nx = -1, ny = -1;
//            for (int j = 0; j < 4; j++) {
//                if (plan == moveTypes[j]) {
//                    nx = x + dx[j];
//                    ny = y + dy[j];
//                }
//            }
//            // 공간을 벗어나는 경우 무시
//            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//            // 이동 수행
//            x = nx;
//            y = ny;
//        }
//
//        System.out.println(x + " " + y);

    }
}
