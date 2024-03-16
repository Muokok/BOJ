package bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2750 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(scan.nextInt());
        }

        Collections.sort(list);
        for(Integer result: list){
            System.out.println( result);
        }
/*
        아래처럼 정렬 알고리즘을 직접 구현하려 했으나, 내장 메소드가 있길래 그냥 사용함.
        for(int i=0;i<N;i++){
            int num = scan.nextInt();

            try{
                if(list.get(i) > num){
                    list.add(i-1,num);
                }
            }catch (IndexOutOfBoundsException e){
                list.add(num);
            }
        }*/

    }
}
