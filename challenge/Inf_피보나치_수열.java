package challenge;

import java.util.*;

public class Inf_피보나치_수열 {
    // 재귀, 배열 두 방식 모두 풀 줄 알아야 한다.
    // 피보나치 수열에서 재귀보다 for문이 성능적으로 더 좋다. 왜냐? 재귀는 스텍 프레임이 쌓이기 때문

    // 버전 2 (더 개선된 메모이제이션)

    static int [] fibo;

    public static int dfs(int n){
        if(fibo[n]>0) return fibo[n]; //이미 존재하는 값(배열에 존재하는 값)은 retunn해줌, 시간복잡도가 확 준다.
        if(n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n-2) + dfs(n-1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibo = new int [n + 1];
        dfs(n);

        for(int i=1; i<n; i++){
            System.out.print(fibo[i] + " ");
        }

    }



//    버전 1
//    static int [] fibo;
//
//    public static int dfs(int n){
//        if(n == 1 || n == 2) return fibo[n] = 1;
//        else return fibo[n] = dfs(n-2) + dfs(n-1);
//    }
//
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        fibo = new int [n + 1];
//        dfs(n);
//
//        for(int i=1; i<n; i++){
//            System.out.print(fibo[i] + " ");
//        }
//
//    }
}
