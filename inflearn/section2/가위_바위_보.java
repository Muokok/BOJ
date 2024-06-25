package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가위_바위_보 {

    public static String solution(int num, String input){



        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arrA = new int[N];
        int [] arrB = new int[N];

        String inputA = br.readLine();
        String inputB = br.readLine();
        String[] inputAList = inputA.split(" ");
        String[] inputBList = inputB.split(" ");

        for(int i=0; i<N;i++){
            arrA[i] = Integer.parseInt(inputAList[i]);
            arrB[i] = Integer.parseInt(inputBList[i]);
        }

        for (int j=0; j<N; j++){
            // 1:가위, 2:바위, 3:보

            if(arrA[j] == arrB[j]){ // 비겼을 때
                System.out.println("D");
                continue;
            }


            if(arrA[j]==1){
                if(arrB[j] == 2){
                    System.out.println("B");
                }
                else{
                    System.out.println("A");
                }
            }

            if (arrA[j]==2){
                if (arrB[j]==3){
                    System.out.println("B");
                }
                else{
                    System.out.println("A");
                }
            }

            if (arrA[j]==3){
                if (arrB[j]==1){
                    System.out.println("B");
                }
                else{
                    System.out.println("A");
                }
            }
        }
    }

}
