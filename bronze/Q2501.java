package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2501 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i=1; i <= N; i++){
            if( N%i == 0){
                list.add(i);
            }
        }

        try {
            System.out.println(list.get(K-1));

        }catch (IndexOutOfBoundsException e) {
            System.out.println(0);
        }
    }

}
