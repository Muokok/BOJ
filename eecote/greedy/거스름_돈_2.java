package eecote.greedy;

import java.util.*;

public class 거스름_돈_2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] coin = {500, 100, 50, 10};
        int answer = 0;

        int N = sc.nextInt();


        for(int i=0; i<4; i++){
            while(N >= coin[i]){
                N -= coin[i];
                answer ++;
            }
        }
        System.out.print(answer);
    }
}
