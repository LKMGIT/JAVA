package backjoon;

/*
괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 */

/*
문제 접근: 스택 사용해서 했던 거 같았는데...
) 입력 하면 pop을 해서? 다 했을 때 ( <- 얘가 남아 있으면 VPS가 아님 ㅇㅇ 암튼 그럼
스택 구현 하기 귀찮 함수 사용
 */

import java.util.Scanner;
import java.util.Stack;

public class q9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            String text = sc.nextLine();
            for (int j = 0; j < text.length(); j++) {
                char c = text.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
