package challenge;

import java.util.Scanner;

public class B_B5_8393 {

    static int solution(int n){
        int result = 0;

        for(int i=1; i <= n; i++){
            result = result + i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));

    }

}
