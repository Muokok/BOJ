package programmers.lv1;

public class L1_제일_작은_수_제거하기 {

    public int[] solution(int[] arr) {
        if(arr.length == 0 || arr.length == 1) return new int [] {-1};

        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // 최솟값을 제외한 새로운 배열 생성
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
