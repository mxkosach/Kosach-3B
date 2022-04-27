package by.bsu.lab3b._main;

import by.bsu.lab3b.entity.StraightLine;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        final int BOUND = 5;
        StraightLine[] lines = new StraightLine[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            do
                lines[i] = new StraightLine(random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
            while (lines[i].getA() == 0 || lines[i].getB() == 0);
        }

        System.out.println("Точки персечения с осями:");
        for (int i = 0; i < n; i++) {
            System.out.print(lines[i] + "\t");
            System.out.print(lines[i].getPointIntersectionWithX() + "\t");
            System.out.println(lines[i].getPointIntersectionWithY() + "\t");
        }

        System.out.println("*****************************************************");

        System.out.println("Взаимное расположение прямых:");
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                System.out.println(lines[i] + "\t" + lines[j] + " -- " + lines[i].getPointIntersectionLines(lines[j]));

    }
}

