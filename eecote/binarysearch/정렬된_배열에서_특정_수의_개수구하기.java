    package eecote.binarysearch;

    import java.io.*;

    public class 정렬된_배열에서_특정_수의_개수구하기 {

        /*
        * 입력 예시 "7 2, 1 1 2 2 2 2 3"을 사용하여 실행 과정을 설명하겠습니다.
            lowerBound 실행 과정
            target = 2를 찾는 과정
            arr = [1, 1, 2, 2, 2, 2, 3]
            첫 번째 반복
                start = 0, end = 7
                mid = (0 + 7) / 2 = 3
                arr = 2 >= target(2) → end = 3
            두 번째 반복
                start = 0, end = 3
                mid = (0 + 3) / 2 = 1
                arr = 1 < target(2) → start = 2
            세 번째 반복
                start = 2, end = 3
                mid = (2 + 3) / 2 = 2
                arr = 2 >= target(2) → end = 2
            반복 종료
                start = 2, end = 2
                first = 2 (2가 처음 나타나는 위치)

            upperBound 실행 과정
            첫 번째 반복
                start = 0, end = 7
                mid = (0 + 7) / 2 = 3
                arr = 2 <= target(2) → start = 4
            두 번째 반복
                start = 4, end = 7
                mid = (4 + 7) / 2 = 5
                arr = 2 <= target(2) → start = 6
            세 번째 반복
                start = 6, end = 7
                mid = (6 + 7) / 2 = 6
                arr = 3 > target(2) → end = 6
            반복 종료
                last = 6 (2 다음 숫자의 위치)
            최종 결과 계산
                first = 2 (첫 번째 2의 위치)
                last = 6 (마지막 2 다음 위치)
                결과 = last - first = 6 - 2 = 4 (2의 개수)
            이렇게 이진 탐색을 두 번 사용하여 O(logN) 시간 복잡도로 특정 숫자의 개수를 찾을 수 있습니다.
        *
        * */
        public static int lowerBound(int [] arr, int target){
            int start = 0;
            int end = arr.length;

            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] >= target){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        public static int upperBound(int [] arr, int target){
            int start = 0;
            int end = arr.length;

            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] > target){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        public static int countElements(int[] arr, int x) {
            int first = lowerBound(arr, x);
            int last = upperBound(arr, x);
            return first == arr.length || arr[first] != x ? -1 : last - first;
        }

        public static void main(String [] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String [] NX = br.readLine().split(" ");
            int n = Integer.parseInt(NX[0]);
            int x = Integer.parseInt(NX[1]);

            String [] input = br.readLine().split(" ");
            int [] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(input[i]);
            }

            System.out.print(countElements(arr, x));

        }
    }
