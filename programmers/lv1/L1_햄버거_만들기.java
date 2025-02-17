package programmers.lv1;

public class L1_햄버거_만들기 {
    public int solution(int[] ingredient) {
        int [] stack = new int[ingredient.length];
        int now = 0;

        int result = 0;
        for(int i : ingredient){
            stack[now] = i;
            now ++;

            if(now >= 4){
                if(stack[now-4] == 1 &&
                        stack[now-3] == 2 &&
                        stack[now-2] == 3 &&
                        stack[now-1] == 1
                ){
                    now -= 4;
                    result ++;
                }
            }
        }
        return result;
    }
}
