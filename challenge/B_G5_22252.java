package challenge;


import java.util.*;

public class B_G5_22252 {

    // 고릴라들의 정보를 저장할 HashMap
    private Map<String, PriorityQueue<Integer>> gorillas;
    // 호석이가 구매한 정보의 총 가치
    private long totalValue;

    public B_G5_22252() {
        gorillas = new HashMap<>();
        totalValue = 0;
    }

    // 고릴라에게 새로운 정보 추가
    public void addInformation(String name, int[] values){
        PriorityQueue<Integer> pq = gorillas.getOrDefault(name,
                new PriorityQueue<>(Collections.reverseOrder())); // 내림차순 정렬

        for(int value : values){
            pq.offer(value); // 큐에 새로운 요소를 추가, 이 과정에서 내부적으로 정렬이 이루어짐
        }
        gorillas.put(name, pq);
    }

    // 호석이가 정보 구매
    public void buyInformation(String name, int count){
        PriorityQueue<Integer> pq = gorillas.get(name);
        if (pq == null) return;

        int bought = 0;
        while (!pq.isEmpty() && bought < count){
            totalValue += pq.poll();
            bought++;
        }
    }

    // 총 가치 반환
    public long getTotalValue(){
        return totalValue;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        B_G5_22252 problem = new B_G5_22252();

        for(int i =0; i<Q; i++){
            int queryType = sc.nextInt();
            String name = sc.next();

            if(queryType == 1){
                int k = sc.nextInt();
                int [] values = new int[k];
                for(int j=0; j<k; j++){
                    values[j] = sc.nextInt();
                }
                problem.addInformation(name, values);
            } else if(queryType == 2){
                int b = sc.nextInt();
                problem.buyInformation(name, b);
            }
        }

        System.out.println(problem.getTotalValue());
        sc.close();
    }
}
