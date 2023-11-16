package silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q11399 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int result = 0;
        int N = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i <N; i++){
            arr.add(scan.nextInt());
        }

        Collections.sort(arr);

        for(int i=0; i <N;i++){
            result = result + arr.get(i) * (N-i);
        }
        System.out.println(result);





    }
}
