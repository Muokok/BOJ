package eecote.Implementation;

import java.util.*;

public class 시각_2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;


        for(int h=0; h<=N; h++){
            for(int m=0; m<60; m++ ){
                for(int s=0; s<60; s++){
                    if(h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3){
                        // 30,31,32,33,34,35,36,37,38,39
                        // m % 30 ->
                        cnt ++;
                    }
                }
            }
        }
        System.out.print(cnt);

        // 24* 60*60


    }
}
