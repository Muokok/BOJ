package silver;

import java.util.Scanner;

public class Q25206 {
    static public void main(String [] args){
        //전공평점 =  모든 전공과목의 (학점 × 과목평점)의 합 / 학점의 총합
        Scanner scan = new Scanner(System.in);

        double credit = 0;  // 학점
        double credit_sum = 0;  // 학점 총합
        String subjectGrade = null; // 과목평점 (알파벳)
        double subjectGradeToFloat = 0; // 과목평점 (숫자)
        double creditXsubjectGrade_sum=0;

        double result = 0;

        for(int i =0; i< 20; i++){
            //System.out.println("Start for loop");
            String subjectName = scan.next();
            credit = scan.nextDouble();
            subjectGrade = scan.next();


            if(subjectGrade.contentEquals("P")){
                continue;
            }
            else if(subjectGrade.contentEquals("A+")){
                subjectGradeToFloat = 4.5;
            }
            else if(subjectGrade.contentEquals("A0")){
                subjectGradeToFloat = 4.0;
            }
            else if(subjectGrade.contentEquals("B+")){
                subjectGradeToFloat = 3.5;
            }
            else if(subjectGrade.contentEquals("B0")){
                subjectGradeToFloat = 3.0;
            }
            else if(subjectGrade.contentEquals("C+")){
                subjectGradeToFloat = 2.5;
            }
            else if(subjectGrade.contentEquals("C0")){
                subjectGradeToFloat = 2.0;
            }
            else if(subjectGrade.contentEquals("D+")){
                subjectGradeToFloat = 1.5;
            }
            else if(subjectGrade.contentEquals("D0")){
                subjectGradeToFloat = 1.0;
            }
            else if(subjectGrade.contentEquals("F")){
                subjectGradeToFloat = 0.0;
            }
            //전공평점 =  모든 전공과목의 (학점 × 과목평점)의 합 / 학점의 총합
            credit_sum = credit_sum + credit; //학점 총합 구하기
            //System.out.printf("credit_sum = %f\n",credit_sum);
            creditXsubjectGrade_sum = creditXsubjectGrade_sum+ (credit*subjectGradeToFloat);
            //System.out.printf("creditXsubjectGrade_sum = %f\n",creditXsubjectGrade_sum);
        }
            result = creditXsubjectGrade_sum / credit_sum;
            System.out.printf("%f", result);
    }
}
