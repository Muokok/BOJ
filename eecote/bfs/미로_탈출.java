package eecote.bfs;

import java.io.*;

public class 미로_탈출 {
    static int [][] graph = new int[200][200];


    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] nm = br.readLine();

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for(int i=0; i<nl i++){
            String input = br.readLine();
            for(int j=0; j<m; j++){
                graph[i][j] = input.charAt(j) - '0';
            }
        }






    }
}
