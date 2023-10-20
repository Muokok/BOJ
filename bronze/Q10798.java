package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char [][] ch = new char[5][15];
        int max=0;


        for (int i = 0; i < ch.length; i++) {
            //System.out.println(ch.length); // 5가 출력됨
            String line = scan.nextLine();
            if(max < line.length()){
                max = line.length();
            }

            for(int j=0; j < line.length(); j++){
                ch[i][j] = line.charAt(j);
            }
        }

        for(int k=0; k<max; k++){
            for(int l=0; l<5; l++){
                if(ch[l][k] == '\0') continue;
                System.out.print(ch[l][k]);
            }
        }




    }
}
