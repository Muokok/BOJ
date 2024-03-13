package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9506 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            int n = scan.nextInt();
            if(n == -1) break;

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<n; i++){
                if(n%i ==0){
                    list.add(i);
                }
            }

            int sum = 0;
            for (int number : list) {
                sum += number;
            }

            if(sum != n){
                System.out.println(n + " is NOT perfect.");
            }
            else {
                System.out.print(n + " = ");

                for (Integer integer : list) {
                    if(integer == 1){
                        System.out.print( integer);
                    }
                    else{
                        System.out.print(" + " + integer);
                    }
                }
                System.out.println();

            }
        }
    }
}
