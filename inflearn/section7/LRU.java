package inflearn.section7;

import java.util.*;

public class LRU {

//    public static void main(String [] args){ ArrayList를 사용한 방식 -> 매우 쉽다.
//        Scanner sc = new Scanner(System.in);
//
//        int S = sc.nextInt();
//        int N = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//
//
//        for(int i =0; i<N; i++){
//            int input = sc.nextInt();
//
//            if(list.contains(input)){
//                list.remove(Integer.valueOf(input));
//            }
//            list.add(0, input);
//
//            if(list.size() > S) { // Perplexity가 추가해준 코드:
//                                    // 리스트 크기가 S를 초과할 경우 마지막 요소를 제거하는 로직을 추가하면 메모리 관리가 더 효율적일 수 있습니다.
//                list.remove(list.size()-1);
//            }
//        }
//
//        for(int j =0; j<S; j++){
//            System.out.print(list.get(j) + " ");
//        }
//    }

    public static void main(String [] args){ // 배열 사용 -> 매우 어렵다
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int [] arr = new int[S];

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int input = sc.nextInt();

            int pos = -1; // 인덱스
            for(int j=0; j<S; j++){
                if(arr[j] == input){
                    pos = j; // Hit된 지점 저장
                }
            }

            if(pos == -1){
                for(int k = S-1; k>= 1; k--){
                    arr[k] = arr[k-1];
                }
                arr[0] = input;
            }else{
                for(int k = pos; k>= 1; k--){
                    arr[k] = arr[k-1];
                }
                arr[0] = input;
            }
        }


        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
