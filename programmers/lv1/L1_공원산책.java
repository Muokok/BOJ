package programmers.lv1;

public class L1_공원산책 {

    static int x = 0;
    static int y = 0;

    static boolean simulate(String direction, int moveNum, String[] park){
        int [] dirIdx = new int [2];

        if(direction.equals("E")){
            dirIdx = new int []{0,1};
        }else if(direction.equals("W")){
            dirIdx = new int []{0,-1};
        }else if(direction.equals("S")){
            dirIdx = new int []{1,0};
        }else if(direction.equals("N")){
            dirIdx = new int []{-1,0};
        }

        int nx =x;
        int ny =y;

        for(int i=0; i<moveNum; i++){
            nx +=  dirIdx[0];
            ny += dirIdx[1];


            if(nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()
                    || park[nx].charAt(ny) == 'X') {
                return false;
            }
        }

        // 이동 가능한 경우에만 위치 업데이트
        x = nx;
        y = ny;
        return true;

    }

    public int[] solution(String[] park, String[] routes) {

        // 시작 위치 설정
        for(int i=0; i< park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        /**
         * 아래처럼 개선 가능
         * for(int i=0; i<park.length; i++){
         *             if(park[i].contains("S"))
         *             {
         *                 x = i;
         *                 y = park[i].indexOf("S");
         *             }
         *         }
         *         */

        for(int i=0; i<routes.length; i++){
            String [] route = routes[i].split(" ");
            String direction = route[0];
            int moveNum = Integer.parseInt(route[1]);

            simulate(direction, moveNum, park);
        }


        return new int []{x,y};
    }

}
