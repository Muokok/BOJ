package challenge;

import java.util.*;

public class Inf_이진수_출력 {

    static void dfs(int N){

        if(N == 0) return;
        else{
            dfs(N/2);
            System.out.print(N%2);
        }
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dfs(N);
    }
}
