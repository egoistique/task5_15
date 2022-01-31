package com.company;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void printPicture(int h, int w){
        PrintStream out = System.out;

        int epCount = 0;
        int chCount = 0;
        char ch = ' ';

        for (int i = 0; i < h; i++) {
            if (i == 0 || i == h - 1) {
                out.print(" ");
                for (int j = 0; j < w - 2; j++) {
                    out.print("-");
                }
                out.println();
                continue;
            }

            out.print("|");
            for (int j = 0; j < w - 2; j++) {
                if (chCount == 0) {
                    if (ch == '!') {
                        ch = ' ';
                        chCount = w - 2;
                    } else {
                        ch = '!';
                        epCount++;
                        chCount = epCount;
                    }
                }
                out.print(ch);
                chCount--;
            }
            out.println("|");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        printPicture(h, w);
    }
}
