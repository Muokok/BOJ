package silver;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList <Character> cArr = new ArrayList<>();

        String s =scan.next();
        int count = 0;

        for(int i =0; i<s.length(); i++){
            cArr.add(s.charAt(i));
        }

        for(int j=0; j <s.length(); j++){
            char currentChar = cArr.get(j);
            if(currentChar =='c'){
                if (j < s.length() - 1 && cArr.get(j+1) =='=') {
                    count++;
                    j++;
                } else if (j < s.length() - 1 && cArr.get(j+1) =='-') {
                    count++;
                    j++;
                } else{
                    count++;
                }
            }

            else if(currentChar =='d'){
                if (j < s.length() - 1 && cArr.get(j+1) =='-') {
                    count++;
                    j++;
                } else if (j < s.length() - 2 && cArr.get(j + 1) == 'z' && cArr.get(j + 2) == '=') {
                    count++;
                    j = j+2;
                } else{
                    count++;
                }
            }
            else if(currentChar =='l'){
                if (j < s.length() - 1 && cArr.get(j+1) =='j') {
                    count++;
                    j++;
                } else{
                    count++;
                }
            }
            else if(currentChar =='n'){
                if (j < s.length() - 1 && cArr.get(j+1) =='j') {
                    count++;
                    j++;
                } else{
                    count++;
                }
            }
            else if(currentChar =='s'){
                if (j < s.length() - 1 && cArr.get(j+1) =='=') {
                    count++;
                    j++;
                } else{
                    count++;
                }
            }
            else if(currentChar =='z'){
                if (j < s.length() - 1 && cArr.get(j+1) =='=') {
                    count++;
                    j++;
                } else{
                    count++;
                }
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
