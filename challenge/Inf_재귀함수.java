package challenge;

import java.util.*;

public class Inf_재귀함수 {

    public static void dfs(int N){
        if(N ==0) return;
        else{
            dfs(N-1);
            System.out.print(N);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dfs(N);
    }

}
