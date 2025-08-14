package backjoon;

import java.io.*;
import java.util.*;

class MySet {
    private final Set<Integer> s = new HashSet<>();

    public void add(int x)    { s.add(x); }
    public void remove(int x) { s.remove(x); }

    // 출력은 하지 않고 결과만 반환
    public int check(int x)   { return s.contains(x) ? 1 : 0; }

    // check를 부르면 출력이 섞이므로 contains로만 판별
    public void toggle(int x) {
        if (s.contains(x)) s.remove(x);
        else s.add(x);
    }

    public void all() {
        s.clear();
        for (int i = 1; i <= 20; i++) s.add(i);
    }

    public void empty() { s.clear(); }
}

public class q11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        MySet set = new MySet();

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            String[] tok = line.split(" ");
            String cmd = tok[0];
            int x = (tok.length == 2) ? Integer.parseInt(tok[1]) : 0; // all/empty 안전 처리

            switch (cmd) {
                case "add"    -> set.add(x);
                case "remove" -> set.remove(x);
                case "check"  -> out.append(set.check(x)).append('\n'); // 여기서만 출력 모음
                case "toggle" -> set.toggle(x);
                case "all"    -> set.all();
                case "empty"  -> set.empty();
            }
        }
        System.out.print(out.toString()); // 한 번에 출력 → 마지막 0까지 확실히 나감
    }
}
