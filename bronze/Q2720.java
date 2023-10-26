package bronze;

import java.util.Scanner;

public class Q2720 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int [][] arr = new int[T][4];

        for(int i=0; i< T; i++){
            int cent = scan.nextInt();
            int Quarter = 0;
            int Dime =0;
            int Nickel = 0;
            int Penny = 0;

            Quarter = (cent / 25);
            cent = (cent % 25);

            Dime = (cent / 10);
            cent = (cent % 10);

            Nickel = (cent / 5);
            cent = (cent % 5);

            Penny = cent;

            arr[i][0]= Quarter;
            arr[i][1]= Dime;
            arr[i][2]= Nickel;
            arr[i][3]= Penny;
        }

        for(int i=0; i<T; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
