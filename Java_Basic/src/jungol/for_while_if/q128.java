package jungol.for_while_if;

import java.io.*;

public class q128 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        String input[] = bf.readLine().split(" ");

        for(String s : input){

            int num = Integer.parseInt(s);

            if (num != 0) {
                if (!(num % 3 == 0) && !(num % 5 == 0)) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count)); // 또는 Integer.toString(count)
        bw.flush();
        bw.close();

    }
}
