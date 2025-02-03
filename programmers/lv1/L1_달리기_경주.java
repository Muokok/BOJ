package programmers.lv1;
import java.util.*;

public class L1_달리기_경주 {
    public String[] solution(String[] players, String[] callings) {

        Map<String,Integer> nameToPosition = new HashMap<>();
        Map<Integer,String> positionToName = new HashMap<>();


        for(int i=0; i< players.length; i++){
            String name = players[i];

            nameToPosition.put(name, i);
            positionToName.put(i, name);

        }

        for(String calledName : callings){
            int currentPosition = nameToPosition.get(calledName);
            int frontPosition = currentPosition-1;

            // 앞 선수의 이름
            String frontPlayer = positionToName.get(frontPosition);

            nameToPosition.put(calledName, frontPosition);
            nameToPosition.put(frontPlayer, currentPosition);
            positionToName.put(frontPosition, calledName);
            positionToName.put(currentPosition, frontPlayer);

        }


        String[] answer = new String[players.length];
        for(int i=0; i<players.length; i++ ){
            answer[i] = positionToName.get(i);
        }


        return answer;
    }
}
