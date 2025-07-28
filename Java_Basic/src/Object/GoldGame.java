package Object;

import java.util.Scanner;

abstract class Sprite {
    int x = 3, y = 3;

    abstract void move(char c);
}

class Main extends Sprite {
    void move(char c) {
        if (c == 'h') --x;
        else if (c == 'j') ++y;
        else if (c == 'k') --y;
        else if (c == 'l') ++x;
    }
}

class Monster extends Sprite {
    public Monster() {
        x = y = 7;
    }

    void move(char c) {
        x += (Math.random() - 0.5) > 0 ? 1 : -1;
        y += (Math.random() - 0.5) > 0 ? 1 : -1;
    }
}


public class GoldGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monster m = new Monster();
        Sprite p = new Main();

        char arr[][] = new char[17][17];

        arr[4][5] = 'G';
        arr[m.x][m.y] = 'M';
        arr[p.x][p.y] = '@';

        draw(arr);

        while (true) {

            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
            char mov = sc.nextLine().charAt(0);

            if ("hjkl".indexOf(mov) != -1) {
                arr[p.x][p.y] = '\0';
                arr[m.x][m.y] = '\0';
                p.move(mov);
                m.move(mov);
                arr[p.x][p.y] = '@';
                arr[m.x][m.y] = 'M';
            }

            draw(arr);

            if(arr[p.x][p.y] == arr[4][5]){
                System.out.print("황금을 찾았습니다!!!");
                break;
            } else if (arr[p.x][p.y] == arr[m.x][m.x]) {
                System.out.println("몬스터에게 잡혔습니다..");
                break;
            }

        }

    }

    public static void draw(char arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%c", arr[i][j]);
            }
            System.out.println("");
        }
    }

}












