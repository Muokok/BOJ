package silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            list.add(Integer.parseInt(line));
        }


        Collections.sort(list);
        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
