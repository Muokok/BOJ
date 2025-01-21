package eecote.Implementation;

import java.io.*;

public class 상하좌우_2 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [][] map = new int [N+1][N+1];
        int [] current = {1,1};

        String [] input = br.readLine().split(" ");

        for(int i=0; i<input.length; i++){
            if(input[i].equals("R") && current[1] + 1 <= N){
                current[1] ++;
            }else if(input[i].equals("D")&& current[0] + 1 <= N){
                current[0] ++;
            }else if(input[i].equals("L")&& current[1] - 1 > 0){
                current[1] --;
            }else if(input[i].equals("U")&& current[0] - 1 > 0){
                current[0] --;
            }
        }

        System.out.print(current[0] + " " + current[1]);

    }
}
