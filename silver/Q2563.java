package silver;

import java.util.Scanner;

public class Q2563 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [][] arr = new int[100][100];
        int result = 0;

        int num =scan.nextInt();
        for(int i=0; i < num; i++){
            int x1 = scan.nextInt();
            int y2 = scan.nextInt();

            for(int x=0; x< 10; x++){
                for(int y=0; y<10; y++){
                    if(arr[x+x1][y+y2] == 1){
                        continue;
                    }
                    arr[x+x1][y+y2] = 1;
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
