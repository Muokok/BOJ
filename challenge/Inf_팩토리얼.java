package challenge;

import java.util.*;

public class Inf_팩토리얼 {

    public static int dfs(int N){

        if(N == 1) {
            return 1;
        }
        else return N*dfs(N-1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dfs(N);

    }
}
