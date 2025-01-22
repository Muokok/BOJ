package eecote.Implementation;

import java.util.*;

public class 럭키_스트레이트 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int mid = num.length() / 2;

        String left = num.substring(0,mid);
        String right = num.substring(mid,num.length());

        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<left.length(); i++){
            leftSum += left.charAt(i) - '0';
            rightSum += right.charAt(i) - '0';
        }

        if(leftSum == rightSum){
            System.out.print("LUCKY");
        }else{
            System.out.print("READY");
        }

    }


}
