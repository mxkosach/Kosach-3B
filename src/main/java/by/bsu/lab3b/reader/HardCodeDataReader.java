//package by.bsu.lab3b.reader;
//
//import by.bsu.lab3b.entity.StraightLine;
//
//public class HardCodeDataReader {
//    public static StraightLine[] generateAndGetTrain() {
//        int n = 6;
//        StraightLine[] lines = new StraightLine[n];
//        for (int i = 0; i < n - 2; i++) {
//            lines[i] = new StraightLine((int) Math.random() * 100 - 50, (int) Math.random() * 100 - 50, (int) Math.random() * 100 - 50, (int) Math.random() * 100 - 50);
//        }
//        lines[n - 2] = new StraightLine(lines[0].getX1() * 2, lines[0].getY1() * 2, lines[0].getX2() * 2, lines[0].getY2() * 2);
//        lines[n - 1] = new StraightLine(lines[2].getX1() * 4, lines[2].getY1() * 4, lines[2].getX2() * 4, lines[2].getY2() * 4);
//        return lines;
//    }
//}
