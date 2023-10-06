package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11718 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine())!= null){
            // '(s = br.readLine())!= null' 가 true가 되는 경우는 ex:"Hello"를 입력했을 때, 심지어 아무런 입력없이
            //  Enter키만 누르면 br.readline()은 빈 문자열만 반환하고 여전이 ture가 된다.
            // 그렇다면 br.readline() 메소드가 null을 반환하는 경우는?
            /*
            * 1. 파일의 끝 (EOF, End of File): 파일에서 데이터를 읽을 때, 파일의 끝에 도달하면 br.readLine()은 null을 반환합니다.
            * 이것은 파일의 모든 내용을 읽었음을 나타냅니다.
            * 2. 스트림이 닫힌 경우: 입력 스트림 (System.in 또는 파일)이 이미 닫혔을 때 br.readLine()은 null을 반환합니다.
            * 이는 스트림이 더 이상 데이터를 제공하지 않음을 나타냅니다.
            * 3. EOF 문자 입력 (Ctrl+D 또는 Ctrl+Z):
            * 명령 프롬프트에서 입력 스트림이 EOF 문자 (End of File, 예: Ctrl+D for Linux/macOS, Ctrl+Z for Windows)를 받으면
            * br.readLine()은 null을 반환합니다.
            * */
            System.out.println(s);
        }
    }
}
