package bronze;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int sum = 1;

        if(N==0){
            System.out.println(1);
        }
        else{
            for(int i=1; i<=N; i++){
                sum = sum*i;
            }

            System.out.println(sum);
        }
    }
}
