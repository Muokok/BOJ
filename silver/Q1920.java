package silver;

import java.util.*;

public class Q1920 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            set.add(sc.nextInt());
        }

        int M = sc.nextInt();
        int [] arrM = new int[M];

        for(int j=0; j<M; j++){
            int num =  sc.nextInt();
            if(set.contains(num)){
                arrM[j] = 1;
            }
            else{
                arrM[j] = 0;
            }
        }

        for(int answer : arrM){
            System.out.println(answer);
        }
    }
}
