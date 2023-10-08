package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> resArr = new ArrayList<>();

        int [] arr = {1,1,2,2,2,8};

        for(int i=0;i<6;i++){
            int num = scan.nextInt();
            int res = arr[i] - num;
            resArr.add(res);
        }
        for(Integer real:resArr){
            System.out.print(real);
            System.out.print(" ");
        }
    }
}