package bronze;

import java.util.Scanner;

public class Q2566 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [][] arr = new int[9][9];
        int max = 0;
        int max_row = 0;
        int max_col = 0;

        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                arr[row][col] = scan.nextInt();
                if(arr[row][col] > max){
                    max = arr[row][col];
                    //max_row = row + 1; //이렇게 하면 틀림 >> 전부 다 0일 때 행,열이 0 0 이 출력되므로
                    //max_col = col + 1;
                    max_row = row;
                    max_col = col;
                    System.out.println(max_row);
                    System.out.println(max_col);
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d",max_row + 1,max_col + 1);
         //System.out.printf("%d %d",max_row,max_col); //이렇게 하면 틀림 >> 전부 다 0일 때 행,열이 0 0 이 출력되므로
    }
}