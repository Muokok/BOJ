package programmers.lv1;

public class L1_바탕화면_정리 {
    public int[] solution(String[] wallpaper) {
        int h = wallpaper.length;
        int w = wallpaper[0].length();

        int minX = h+1;
        int minY = w+1;
        int maxX = -1;
        int maxY = -1;

        // [".#...", "..#..", "...#."]

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                char point = wallpaper[i].charAt(j);

                if(point == '#'){
                    if(i <= minX){
                        minX = i;
                    }

                    if(j <= minY){
                        minY = j;
                    }

                    if(i > maxX){
                        maxX = i;
                    }
                    if(j > maxY){
                        maxY = j;
                    }
                    /* 아래처럼 하는게 더 깔끔*/
//                    minX = Math.min(minX,i);
//                    minY = Math.min(minY,j);
//                    maxX = Math.max(maxX,i);
//                    maxY = Math.max(maxY,j);
                }
            }
        }
        int[] answer = {minX, minY, maxX+1, maxY+1};


        return answer;
    }
}
