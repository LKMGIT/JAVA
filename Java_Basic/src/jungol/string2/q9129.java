package jungol.string2;

import java.util.Scanner;

public class q9129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String s1 = String.format("%.2f", a);
        String s2 = String.format("%.2f", b);
        String s3 = String.format("%.2f", c);

        String[] aSplit = s1.split("\\.");
        String[] bSplit = s2.split("\\.");
        String[] cSplit = s3.split("\\.");

        System.out.println(aSplit[0]);
        System.out.println(aSplit[1] + bSplit[0]);
        System.out.println(bSplit[1] + cSplit[0]);
        System.out.println(cSplit[1]);
    }
}
