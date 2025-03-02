package silver;

import java.util.*;

public class Q1764 {

//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        Set<String> set = new HashSet<>();
//        List<String> list = new ArrayList<>();
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        for(int i =0; i<N; i++){
//            String name = sc.next();
//            set.add(name);
//        }
//
//        for(int j=0; j<M; j++){
//            String name = sc.next();
//            if(set.contains(name)){
//                list.add(name);
//            }
//        }
//
//        Collections.sort(list);
//
//        System.out.print(list.size() + "\n");
//        for(String name : list){
//            System.out.print(name + "\n");
//        }
//    }

        public static void main(String [] args){ // 자동 정렬되는 트리셋을 사용함.
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        Set<String> result = new TreeSet<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i =0; i<N; i++){
            String name = sc.next();
            set.add(name);
        }

        for(int j=0; j<M; j++){
            String name = sc.next();
            if(set.contains(name)){
                result.add(name);
            }
        }


        System.out.print(result.size() + "\n");
        for(String name : result){
            System.out.print(name + "\n");
        }
    }

}
