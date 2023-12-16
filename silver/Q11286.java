package silver;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q11286 {
    static int N; // 연산의 개수
    static int x; // 입력받는 정수
    static PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
        @Override
        public int compare(Integer a, Integer b){
            int A = Math.abs(a);
            int B = Math.abs(b);
            if(A>B)
                return A-B;

            else if(A == B){
                if(a>b) return 1;
                else return -1;
            }

            else
                return -1;
        }
    });
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        for(int i=0; i<N ;i++){
            x = Integer.parseInt(br.readLine());

            if(x != 0){
                pq.offer(x);
            }
            else{
                if(!pq.isEmpty())
                    sb.append(pq.poll()).append("\n");
                else
                    sb.append("0\n");
            }
        }

        System.out.print(sb);
    }
}

